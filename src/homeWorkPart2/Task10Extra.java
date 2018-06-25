package HomeWorkPart2;

import java.util.Scanner;

public class Task10Extra {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter day number (1 - 7) - ");
        double day = scanner.nextDouble();
        System.out.print("Enter length of the conversation (min) - ");
        double length = scanner.nextDouble();
        double money = 1.5;
        if(day == 6||day == 7){
            System.out.println("sum = " + length * (money * 0.8));
        }else{
            System.out.println("sum = " + length * money);
        }
    }

}
