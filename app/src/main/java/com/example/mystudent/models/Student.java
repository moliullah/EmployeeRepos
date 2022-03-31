package com.example.mystudent.models;

import java.util.List;
import java.util.Vector;

public class Student {
    private String Studentname;
    private double studentCgpa;

    public Student(String studentname, double studentCgpa) {
        Studentname = studentname;
        this.studentCgpa = studentCgpa;
    }

    public String getStudentname() {
        return Studentname;
    }
    public void setStudentname(String studentname) {
        Studentname = studentname;
    }

    public double getStudentCgpa() {
        return studentCgpa;
    }

    public void setStudentCgpa(double studentCgpa) {
        this.studentCgpa = studentCgpa;
    }
    public static List<Student>getAllStudent(){
        List<Student>students=new Vector<>();
        students.add(new Student("oliullah",3.20));
        return students;
    }
}
