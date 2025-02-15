package org.lessons.java.snack3;
import java.lang.reflect.Array;
import java.util.List;
import java.util.ArrayList;

public class StudentRegister{
    private List<Student> students;

    public StudentRegister(){
        students = new ArrayList<>();
    }
    
    public void setAddStudent(Student studentx){
        students.add(studentx);
        System.out.println("Added new student.");
    }
    public void printAllstudents(){
        if(students.isEmpty()){
            System.out.println("No students found.");
        }
        else{
            for (Student student : students) {
                // String name = student.getName();
                // String lastname = student.getLastName();
                // int classyear = student.getClassYear();
                // System.out.printf("Name: %s, Lastname: %s, Classyear: %d %n", name,lastname, classyear);
                System.out.println(student.getInfoStudent());
            }
        }
    }
}
