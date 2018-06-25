package HomeWork;

import java.util.Scanner;

public class Task12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number - ");
        int number = scanner.nextInt();
        int a = 1;
        int b = 1;
        int fib = 2;
        int i = 2;
        while (i < number){
            fib = a + b;
            a = b;
            b = fib;
            i++;
        }
        System.out.println(fib);
    }
}