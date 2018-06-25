package HomeWork;

import java.util.Scanner;

public class Task11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number - ");
        int number = scanner.nextInt();
        int factorial = 1;
        while(number != 0){
            factorial = factorial * number;
            number--;
        }
        System.out.println(factorial);
    }

}