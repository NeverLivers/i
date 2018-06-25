package HomeWork;

import java.util.Scanner;

public class Task9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number - ");
        int number = scanner.nextInt();
        int lastNumber;
        int summ = 0;
        while (number != 0){
            lastNumber = number % 10;
            number = number / 10;
            if(lastNumber == 5){
                summ = summ + 1;
            }

        }
        System.out.println(summ);
    }

}
