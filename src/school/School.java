package school;

import java.util.Scanner;

public class School {
    public static void main(String[] args) {




        Magazine school = new Magazine();
        Scanner input = new Scanner(System.in);
        Manager manager = new Manager(input, school);

        while (true) {
            Menu();
            System.out.println();
            System.out.print("What would you like? - ");
            String choice = input.next();

            switch (choice) {
                case "1":
                    manager.addStudentToSchool();
                    System.out.println(school.toString());
                    break;

                case "2":
                    System.out.println(school.toString());
                    manager.removeStudentByIndex();
                    System.out.println(school.toString());
                    break;

                case "3":
                    System.out.println(school.toString());
                    manager.removeStudentById();
                    System.out.println(school.toString());
                    break;

                case "4":
                    System.out.println(school.toString());
                    break;


                default:
                    System.out.println("Good by");
                    break;

            }


        }
    }
    static void Menu(){

        System.out.println("          M E N U");
        System.out.println("1 - add a student to school");
        System.out.println("2 - remove a student from school by index");
        System.out.println("3 - remove a student from school by id");
        System.out.println("4 - view student's list");


    }
}
