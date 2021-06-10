package org.example;


import com.sun.org.apache.xpath.internal.operations.Or;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
        Course course1 = new Course("Математика");
        Course course2 = new Course("Обществознание");
        Course course3 = new Course("Информатика");
        Course course4 = new Course("История");
        Course course5 = new Course("Английский");
        Course course6 = new Course("Немецкий");
        Course course7 = new Course("Японский");

    List<Student> students = new ArrayList<>(Arrays.asList(
            new Student("Василий", Arrays.asList(course1, course2, course3, course4, course5)),
            new Student("Иван", Arrays.asList(course1, course2, course3, course4, course7)),
            new Student("Олег", Arrays.asList(course2, course3, course4,course6)),
            new Student("Игорь", Arrays.asList(course1, course2, course3, course4, course5, course6, course7)),
            new Student("Саша", Arrays.asList(course1,course5, course6, course7)),
            new Student("Кирилл", Arrays.asList( course2, course3, course4))));
        System.out.println("Task 1");
        List<Course> unique = uniqueCourses(students);
        System.out.println(unique);
        System.out.println("Task 3");
        List<Student> listOfStudents = studentsInCourse(students, "Японский");
        System.out.println(listOfStudents);

    }
        public static List<Student> studentsInCourse(List<Student> students, String course){
        return students.stream()
                .filter(s -> s.getCourses().toString().contains(course))
                .collect(Collectors.toList());
    }



    public static List<Course> uniqueCourses(List<Student> students){
       return students.stream()
                .map(Student::getCourses)
                .flatMap(List::stream)
                .distinct().collect(Collectors.toList());
    }
}
