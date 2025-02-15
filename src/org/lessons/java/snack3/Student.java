package org.lessons.java.snack3;

public class Student {
    private String name;
    private String lastname;
    private int classyear;

    public Student(String name, String lastname, int classyear){
        this.name = name;
        this.lastname = lastname;
        this.classyear = classyear;
    }
    protected String getName(){return name;}
    protected String getLastName(){return lastname;}
    protected int getClassYear(){return classyear;}
    protected String getInfoStudent(){
        String str = String.format("Name: %s, Lastname: %s, Classyear: %d ", name,lastname, classyear);
        return str;
    }
}
