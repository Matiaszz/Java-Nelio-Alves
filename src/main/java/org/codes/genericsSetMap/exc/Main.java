package org.codes.genericsSetMap.exc;

import org.codes.genericsSetMap.exc.models.Course;
import org.codes.genericsSetMap.exc.models.Professor;
import org.codes.genericsSetMap.exc.models.Student;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Professor alex = new Professor(1, "Alex");
        Course c1 = new Course(1, alex);
        Course c2 = new Course(2, alex);
        Course c3 = new Course(3, alex);

        Student s1 = new Student(2, "Jose");
        Student s2 = new Student(3, "Jose2");
        Student s3 = new Student(4, "Jose3");
        Student s4 = new Student(5, "Jose4");
        Student s5 = new Student(6, "Jose5");
        Student s6 = new Student(7, "Jose6");
        Student s7 = new Student(7, "Jose6");

        s1.enrollCourse(c1);
        s2.enrollCourse(c2);
        s3.enrollCourse(c3);
        s4.enrollCourse(c1);
        s5.enrollCourse(c2);
        s6.enrollCourse(c3);
        s7.enrollCourse(c3);

        alex.getTotalStudents();

    }
}
