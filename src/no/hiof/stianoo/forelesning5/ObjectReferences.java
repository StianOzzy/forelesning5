package no.hiof.stianoo.forelesning5;

import no.hiof.stianoo.forelesning5.model.Student;

public class ObjectReferences {

    public static void main(String[] args) {

        Student student1 = new Student("Ole-Edvard", "Ørebæk", 27, "123456");

        Student student2 = student1;

        System.out.println("Student 1: " + student1.getFirstName() + " " + student1.getLastName());
        System.out.println("Student 2: " + student2.getFirstName() + " " + student2.getLastName());

        student2.setLastName("Antonsen");

        System.out.println("Student 1: " + student1.getFirstName() + " " + student1.getLastName());
        System.out.println("Student 2: " + student2.getFirstName() + " " + student2.getLastName());


    }
}
