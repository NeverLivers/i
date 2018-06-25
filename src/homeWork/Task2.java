package HomeWork;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number - ");
        int number1 = scanner.nextInt();
        System.out.print("Enter second number - ");
        int number2 = scanner.nextInt();
        System.out.print("Enter third number - ");
        int number3 = scanner.nextInt();
        int max1 = Math.max(number1, number2);
        int max2 = Math.max(max1, number3);
        System.out.println("Max number - " + max2);
        int min1 = Math.min(number1, number2);
        int min2 = Math.min(min1, number3);
        System.out.println("Min number - " + min2);
    }

}
