package HomeWork;

import java.util.Scanner;

public class Task8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number - ");
        int number1 = scanner.nextInt();
        System.out.print("Enter second number - ");
        int number2 = scanner.nextInt();
        int lastNumber1 = number1 % 10;
        int lastNumber2 = number2 % 10;
        if(lastNumber1 == lastNumber2){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }

}
