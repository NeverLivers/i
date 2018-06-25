package HomeWorkPart2;

import java.util.Scanner;

public class Task14Extra {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter six digit pure  - ");
        int lucky = scanner.nextInt();
        int first = lucky % 10;
        int first2 = lucky / 10;
        int second = first2 % 10;
        int second2 = first2 / 10;
        int third = second2 % 10;
        int third2 = second2 / 10;
        int fourth = third2 % 10;
        int fourth2 = third2 / 10;
        int fifth = fourth2 % 10;
        int fifth2 = fourth2 / 10;
        int six = fifth2 % 10;
        if(first + second + third == fourth + fifth + six){
            System.out.println("you lucky");
        }else{
            System.out.println("you don't lucky");
        }
    }


}
