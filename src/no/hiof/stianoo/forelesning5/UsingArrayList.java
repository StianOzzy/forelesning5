package no.hiof.stianoo.forelesning5;

import no.hiof.stianoo.forelesning5.model.Course;
import no.hiof.stianoo.forelesning5.model.Student;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class UsingArrayList {
    public static void main(String[] args) {

        System.out.println("---Integer ArrayList---");
        ArrayList<Integer> numberList = new ArrayList<>();
        System.out.println("List Size: " + numberList.size());

        numberList.add(42);

        System.out.println("\nUpdated list...");
        System.out.println("List Size: " + numberList.size());
        System.out.println("Current list: " + numberList);

        numberList.add(500);
        numberList.add(35);
        numberList.add(89);

        System.out.println("\nUpdated list...");
        System.out.println("List size: " + numberList.size());
        System.out.println("Current list: " + numberList);

        System.out.println("\nSecond number in list: " + numberList.get(1));
        numberList.remove(1);
        System.out.println("\nSecond number in list has been removed...");
        System.out.println("Second number in list (after removal): " + numberList.get(1));

        System.out.println("\nUpdated list...");
        System.out.println("List size: " + numberList.size());
        System.out.println("Current list: " + numberList);

        System.out.println("\nFor each loop:");
        for (Integer number : numberList) {
            System.out.println(number);
        }

        System.out.println("\nFor each loop (reversed):");
        for (Integer number : numberList.reversed()) {
            System.out.println(number);
        }


        System.out.println("\n---Student ArrayList---");
        ArrayList<Student> studentList = new ArrayList<>();

        Student ole = new Student("Ole-E", "Ørebek", 27, "123456");
        Student john = new Student("John","Doe",40,"654321");

        studentList.add(ole);
        studentList.add(john);

        System.out.println("\nUpdated list...");
        System.out.println("Student list size: " + studentList.size());
        System.out.println("Current list contents: " + studentList);

        for (Student student : studentList) {
            System.out.println(student.getFirstName());
        }
    }
}
