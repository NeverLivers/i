package HomeWorkPart2;

import java.util.Scanner;

public class Task12Extra {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter wind name (1 - weak, 2 - moderate, 3 -strong, 4 - hurricane) - ");
        int wind = scanner.nextInt();
        switch (wind){
            case 1:
                System.out.printf(1 + Math.random() * 3 + " m/sek");
                break;
            case 2:
                System.out.println(5 + Math.random() * 5 + " m/sek");
                break;
            case 3:
                System.out.println(11 + Math.random() * 7 + " m/sek");
                break;
            case 4:
                System.out.println(19 + Math.random() * 81 + " m/sek");
                break;
        }
    }

}
