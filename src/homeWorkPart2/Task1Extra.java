package HomeWorkPart2;

import java.util.Scanner;

public class Task1Extra {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the hand side - ");
        double side1 = scanner.nextDouble();
        System.out.print("Enter the other party - ");
        double side2 = scanner.nextDouble();
        System.out.print("Enter the third party - ");
        double side3 = scanner.nextDouble();
        double sq1 = Math.pow(side1, 2);
        double sq2 = Math.pow(side2, 2);
        double sq3 = Math.pow(side3, 2);
        if (sq1 == sq2 + sq3 || sq2 == sq1 + sq3 || sq3 == sq1 + sq2) {
            System.out.println("this triangle is rectangular");
        }else {
            System.out.println("this triangle is not rectangular");
        }
    }

}
