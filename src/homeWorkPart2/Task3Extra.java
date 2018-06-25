package HomeWorkPart2;

import java.util.Scanner;

public class Task3Extra {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter three-digit number - ");
        int number = scanner.nextInt();
        int first = number % 10;
        int first2 = number / 10;
        int second = first2 % 10;
        int second2 = first2 / 10;
        int third = second2 % 10;
        if(first == second&&second == third&&third == first){
            System.out.println("all numbers are equal");
        }else if(first == second||second == third||third == first){
            System.out.println("the two numbers are equal");
        }else{
            System.out.println("there are no identical numbers");
        }
    }



}
