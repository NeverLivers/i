package HomeWork;

import java.util.Scanner;

public class Task10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number - ");
        int number1 = scanner.nextInt();
        while (number1 > 0){
            if(number1 % 2 == 0){
                number1 = number1 / 2;
                System.out.print(0);
            }else if(number1 % 2 != 0){
                number1 = number1 / 2;
                System.out.print(1);
            }
        }

    }
}
