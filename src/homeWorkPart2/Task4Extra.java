package HomeWorkPart2;

import java.util.Scanner;

public class Task4Extra {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first speed (km/h) - ");
        double kmh = scanner.nextDouble();
        System.out.print("Enter second speed (m/sek) - ");
        double msek = scanner.nextDouble();
        double kmhMsek = kmh / 3600;
        if(kmhMsek > msek){
            System.out.println("first speed bigger");
        }else{
            System.out.println("second speed bigger");
        }
    }

}
