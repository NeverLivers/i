package school;

import java.util.Scanner;

public class Manager {

    private Scanner input;
    private Magazine school;

    public Manager(Scanner input, Magazine school){
        this.input = input;
        this.school = school;
    }
    public void addStudentToSchool() {
        System.out.print("Enter student's first name: ");
        String fName = input.next();
        System.out.println();
        System.out.print("Enter student's last name: ");
        String lName = input.next();
        System.out.println();
        System.out.print("Enter student's age: ");
        int age = input.nextInt();
        System.out.println();
        Student student = new Student(fName, lName, age);
        school.add(student);
    }

    public void removeStudentByIndex(){
        System.out.print("Enter student's index: ");
        int index = input.nextInt();
        school.removeByIndex(index);
    }

    public void removeStudentById(){
        System.out.print("Enter student's id: ");
        int id = input.nextInt();
        school.removeById(id);
    }

}
