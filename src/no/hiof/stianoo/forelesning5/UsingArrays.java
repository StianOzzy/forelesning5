package no.hiof.stianoo.forelesning5;

import no.hiof.stianoo.forelesning5.model.Student;

public class UsingArrays {

    public static void main(String[] args) {

        int[] intArray = new int[3];
        intArray[0] = 1;
        intArray[1] = 2;
        intArray[2] = 3;

        System.out.println(intArray[0] + " " + intArray[1] + " " + intArray[2]);


        Student[] studentArray = new Student[1];

        Student student = new Student("Bingus", "Dingus", 30, "123456");

        studentArray[0] = student;

        System.out.println(studentArray[0].getFirstName());
    }
}
