package HomeWorkPart2;

import java.util.Scanner;

public class Task5Extra {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number - ");
        double number1 = scanner.nextDouble();
        System.out.print("Enter second number - ");
        double number2 = scanner.nextDouble();
        System.out.print("Enter third number - ");
        double number3 = scanner.nextDouble();
        if(number1 == number2||number2 == number3||number3 == number1){
            System.out.println("we have a pare");
        }else{
            System.out.println("we don't have a pare");
        }
    }

}
