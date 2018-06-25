package HomeWork;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter time - ");
        int time = scanner.nextInt();
        if(time < 0||time >24){
            System.out.println("not correct time");
        }else if(time >= 9&&time <= 18){
            System.out.println("I am at work");
        }else{
            System.out.println("I rest");
        }
    }

}