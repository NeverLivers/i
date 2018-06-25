package HomeWorkPart2;

import java.util.Scanner;

public class Task9Extra {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter you mass (kg) - ");
        double mass = scanner.nextDouble();
        System.out.print("Enter you growth (m) - ");
        double growth = scanner.nextDouble();
        double ideal = mass / Math.pow(growth, 2);
        if(ideal < 18){
            System.out.println("you nid a mass");
        }else if(ideal >= 18&&ideal < 25){
            System.out.println("you are normal");
        }else if(ideal >= 25&&ideal < 30){
            System.out.println("you need to lose weight a little");
        }else{
            System.out.println("you are very big");
        }
    }

}
