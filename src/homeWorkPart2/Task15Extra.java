package HomeWorkPart2;

import java.util.Scanner;

public class Task15Extra {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter S square - ");
        double sq = scanner.nextDouble();
        System.out.print("Enter S circle - ");
        double cir = scanner.nextDouble();
        double a = Math.sqrt(sq);
        double r = Math.sqrt(cir / 3.14);
        if(r <= a / 2){
            System.out.println("a circle in a square");
        }else if(r >= (Math.sqrt(2) / 2) * a){
            System.out.println("square in the circle");
        }
    }

}
