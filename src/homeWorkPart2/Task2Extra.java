package HomeWorkPart2;

import java.util.Scanner;

public class Task2Extra {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number - ");
        double number1 = scanner.nextDouble();
        System.out.print("Enter second number - ");
        double number2 = scanner.nextDouble();
        System.out.print("Enter third number - ");
        double number3 = scanner.nextDouble();
        double res1 = number1 % 2 == 0 ? Math.pow(number1, 3) : 0;
        double res2 = number2 % 2 == 0 ? Math.pow(number2, 3) : 0;
        double res3 = number3 % 2 == 0 ? Math.pow(number3, 3) : 0;
        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
    }


}
