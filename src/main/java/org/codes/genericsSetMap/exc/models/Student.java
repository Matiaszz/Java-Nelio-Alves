package org.codes.genericsSetMap.exc.models;

import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;


@Getter
@Setter
public class Student extends User {
    private Set<Course> enrolledCourses = new HashSet<>();

    public void enrollCourse(Course course){
        course.addStudent(this);
        this.enrolledCourses.add(course);
    }

    public Student (Integer id, String name){
        super(id, name);
    }
}
