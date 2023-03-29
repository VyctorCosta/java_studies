package entities;

public class Student {

  Integer code;

  public Student(Integer code) {
    this.code = code;
  }

  public Integer getCode() {
    return this.code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  @Override
  public boolean equals(Object o) {
    if (o == this)
      return true;
    if (!(o instanceof Student)) {
      return false;
    }
    Student student = (Student) o;
    return code.equals(student.code);
  }

  @Override
  public int hashCode() {
    return code.hashCode();
  }

}
