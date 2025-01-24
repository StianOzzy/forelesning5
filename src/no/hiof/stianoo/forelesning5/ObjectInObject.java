package no.hiof.stianoo.forelesning5;

import no.hiof.stianoo.forelesning5.model.Course;
import no.hiof.stianoo.forelesning5.model.Student;

public class ObjectInObject {

    public static void main(String[] args) {

        Student student1 = new Student("Ole-Edvard", "Ørebæk", 27, "123456");

        Course course = new Course("Programmering 2", "ITF10619");

        student1.setFavouriteCourse(course);

        System.out.println("Student 1 favourite course object: " + student1.getFavouriteCourse());

        String favouriteCourseName = student1.getFavouriteCourse().getCourseName();
        System.out.println("Student 1 favourite course name: " + favouriteCourseName);

        course.setCourseName("Programmering 2077");

        System.out.println("Student 1 favourite course name after change: "
                + student1.getFavouriteCourse().getCourseName());

    }
}