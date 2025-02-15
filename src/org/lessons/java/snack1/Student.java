package org.lessons.java.snack1;

public class Student {
    private String name;
    private String lastname;
    private int age;

    public Student(String name,String lastname,int age){
        this.name = name;
        this.lastname=lastname;
        this.age=age;
    }
    protected String getInfoStudent(){
        return String.format("%s, %s, %d", name,lastname,age);
    }
}


