package co.g2academy.collection;

import java.util.ArrayList;

public class TestStudentCollection {

    public static void main(String[] args) {
        Student sonoo = new Student(101, "Sonoo", 23);
        Student ravi = new Student(102, "Ravi", 23);
        Student hanumat = new Student(103, "Hanumat", 25);
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(sonoo);
        studentList.add(ravi);
        studentList.add(hanumat);
        for (Student st : studentList){
            System.out.println(st.id + " " + st.name + " " + st.age);
        }
    }
}
