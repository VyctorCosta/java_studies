package entities;

import java.util.ArrayList;
import java.util.List;

public class Teacher {

  private String name;
  private final List<Course> courses = new ArrayList<>();

  public Teacher(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<Course> getCourses() {
    return this.courses;
  }

  public void addCourses(Course course) {
    courses.add(course);
  }

}
