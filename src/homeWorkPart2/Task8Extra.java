package HomeWorkPart2;

import java.util.Scanner;

public class Task8Extra {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter sum - ");
        int money = scanner.nextInt();
        if(money >= 1000){
            System.out.println("sum = " + (money - (money / 10)));
        }else{
            System.out.println("sum = "+ money);
        }
    }

}
