package HomeWorkPart2;

import java.util.Scanner;

public class Task11Extra {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number (1 - 99) - ");
        int number = scanner.nextInt();
        if(number % 10 == 1&&number / 10 !=1){
            System.out.println(number + "kopeika");
        }else if(number % 10 >=2&&number % 10 <=4){
            System.out.println(number + "kopeiki");
        }else if(number % 10 >=5&&number % 10 <=9||number % 10 ==0){
            System.out.println(number + "kopeek");
        }else if(number / 10 ==1||number % 10 > 1){
            System.out.println(number + "kopeek");
        }
    }

}
