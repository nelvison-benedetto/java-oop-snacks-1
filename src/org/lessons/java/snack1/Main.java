package org.lessons.java.snack1;

public class Main {
    public static void main(String[] args) {
        String name = "Nevil";
        String lastname = "Xxx";
        int age = 44;
        Student student1 = new Student(name,lastname,age);
        System.out.println(student1.getInfoStudent());
        
    }
}
