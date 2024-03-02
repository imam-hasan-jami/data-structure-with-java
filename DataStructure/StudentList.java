package DataStructure;

import java.util.*;

public class StudentList {
    public static void main(String[] args) {
        LinkedList<Student> studentList = new LinkedList<Student>();

        //creating student
        Student s1 = new Student(101, "Sadi", "Ten");
        Student s2 = new Student(101, "Ashik", "Nine");
        Student s3 = new Student(101, "Najim", "Eleven");
        Student s4 = new Student(101, "Prionti", "MBBS");
        Student s5 = new Student(101, "Karim", "Five");

        //adding student to the student list
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);
        studentList.add(s5);

        //printing
        for(Student stdnt : studentList) {
            System.out.println(stdnt.id + "     " + stdnt.name + "      " + stdnt.className);
        }
    }
}
