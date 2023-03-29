package entities;

import java.util.HashSet;
import java.util.Set;

public class Course {

  private char course_code;
  private final Set<Student> students_list = new HashSet<Student>();

  public Course(char course_code) {
    this.course_code = course_code;
  }

  public char getCourseCode() {
    return this.course_code;
  }

  public void setCourseCode(char course_code) {
    this.course_code = course_code;
  }

  public Set<Student> getStudentsList() {
    return this.students_list;
  }

  public void addStudent(Student student) {
    students_list.add(student);
  }
}
