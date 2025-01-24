package no.hiof.stianoo.forelesning5.model;

import java.util.ArrayList;

public class Student {

    private String firstName;
    private String lastName;
    private int age;
    private String studentId;
    private Course favouriteCourse;
    private ArrayList<Course> courses = new ArrayList<>();

    public Student() {

    }

    public Student(String firstName, String lastName, int age, String studentId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.studentId = studentId;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourse(ArrayList<Course> courses) {
        this.courses = courses;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            this.age = 0;
        }
        else if (age > 120) {
            this.age = 120;
        }
        else {
            this.age = age;
        }
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public Course getFavouriteCourse() {
        return favouriteCourse;
    }

    public void setFavouriteCourse(Course favouriteCourse) {
        this.favouriteCourse = favouriteCourse;
    }
}