package HomeWork;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number - ");
        int number = scanner.nextInt();
        if(number % 7 == 0){
            System.out.println(number * 2);
        }
    }

}
