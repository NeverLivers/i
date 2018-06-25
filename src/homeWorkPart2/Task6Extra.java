package HomeWorkPart2;

import java.util.Scanner;

public class Task6Extra {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter speed (km/h) - ");
        double kmh = scanner.nextDouble();
        System.out.print("Enter distance - ");
        double dist = scanner.nextDouble();
        double time = dist / kmh;
        System.out.println("time - " + time + " hours");
    }

}
