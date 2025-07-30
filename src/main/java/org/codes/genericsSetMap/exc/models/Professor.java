package org.codes.genericsSetMap.exc.models;

import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
public class Professor extends User {
    private Set<Course> ownedCourses = new HashSet<>();

    public void getTotalStudents(){
        System.out.println("Students:");
        this.ownedCourses.forEach(c -> c.getEnrolledStudents().forEach(System.out::println));
        int total = this.ownedCourses.stream().mapToInt(c -> c.getEnrolledStudents().size()).sum();
        System.out.println(total);
    }

    public void registerCourse(Course course){
        this.ownedCourses.add(course);
    }

    public Professor(Integer id, String name){
        super(id, name);
    }
}
