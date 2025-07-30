package org.codes.genericsSetMap.exc.models;

import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
public class Course {
    private Integer id;
    private Professor professor;
    private Set<User> enrolledStudents = new HashSet<>();

    public Course(Integer id, Professor professor){
        this.id = id;
        this.professor = professor;
        this.professor.registerCourse(this);
    }

    public void addStudent(User student) {
        this.enrolledStudents.add(student);
    }
}
