package HomeWork;

import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number - ");
        double number1 = scanner.nextDouble();
        System.out.print("Enter second number - ");
        double number2 = scanner.nextDouble();
        if(number1 == 0||number2 == 0){
            System.out.println("true " + 0);
        }else if(number1 % number2 == 0&&number2 / number1 == 0){
            System.out.println("true " + Math.max(number1, number2) / Math.min(number1, number2));
        }else{
            System.out.println("false " + Math.max(number1, number2) / Math.min(number1, number2));
        }
    }

}
