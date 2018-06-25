package HomeWork;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number - ");
        double number = scanner.nextDouble();
        if(number >= 0&&number <=1){
            System.out.println(number);
        }
    }

}
