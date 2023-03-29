package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.Course;
import entities.Student;
import entities.Teacher;

public class Program {

  public static void main(String[] args) {
    final Scanner sc = new Scanner(System.in);
    final Teacher teacher = new Teacher("Alex");

    teacher.addCourses(new Course('A'));
    teacher.addCourses(new Course('B'));
    teacher.addCourses(new Course('C'));

    for (Course course : teacher.getCourses()) {
      System.out.printf("How many Students for course %s? ", course.getCourseCode());
      Integer n_students = sc.nextInt();

      for (int i = 0; i < n_students; i++) {
        course.addStudent(new Student(sc.nextInt()));
      }
    }

    final Set<Student> enrolled_students = new HashSet<Student>();

    for (Course course : teacher.getCourses()) {
      enrolled_students.addAll(course.getStudentsList());
    }

    System.out.printf("Total students: %d%n", enrolled_students.size());

    sc.close();
  }

}
