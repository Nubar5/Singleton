package org.entity;

public class Student {

    private  static Student student=null;
    private  Student (){

    }
public static Student getStudent(){
        if(student==null){
            student = new Student();
            return student;
        }

        else
            return student;
}
}
