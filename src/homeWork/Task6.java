package HomeWork;

import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number - ");
        int number1 = scanner.nextInt();
        System.out.print("Enter second number - ");
        int number2 = scanner.nextInt();
        if(number1 + number2 >=11&&number1 + number2 <= 19){
            System.out.println(number1 + number2);
        }
    }

}
