package org.lessons.java.snack3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StudentRegister studentreg1 = new StudentRegister();
        boolean isRunning = true;

        while (isRunning) {
            System.out.printf("Welcome on StudentReg1, please choose an option: %n1. Add a student. %n2. Check all students. %n3. Exit.%n");
            int choice = input.nextInt();
            switch(choice){
                case 1:
                    System.out.println("insert the name: ");
                    input.nextLine();  //CLEAN THE BUFFER
                    String name = input.nextLine();
                    System.out.println("insert the lastname: ");
                    String lastname = input.nextLine();
                    System.out.println("insert the class year(1-5): ");
                    int classyear = input.nextInt();
                    Student studentx = new Student(name,lastname,classyear);
                    studentreg1.setAddStudent(studentx);
                    break;
                case 2:
                    studentreg1.printAllstudents();
                    break;
                case 3:
                    isRunning = false;
                    break;
                default:
                    System.out.println("Choice not valid.");
            }           
        }
        System.out.println("Bye...");
        //input.close();  here CLOSE AUTOMATICALLY WHEN PROGRAM ENDS
    }
}
