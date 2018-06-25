package HomeWorkPart2;

import java.util.Scanner;

public class Task13Extra {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number A - ");
        int a = scanner.nextInt();
        System.out.print("Enter number B - ");
        int b = scanner.nextInt();
        System.out.print("Enter number C - ");
        int c = scanner.nextInt();
        int sum = a + b + c;
        a = sum > 0 ? a * 2 : 0;
        b = sum > 0 ? b * 2 : 0;
        c = sum > 0 ? c * 2 : 0;
        System.out.println("A = " + a + " B = " + b + " C = " + c);
    }

}
