import java.util.ArrayList;
import java.util.List;

public class LagopusClass {
  String className;
  List students = new ArrayList<Student>();
  List mentors = new ArrayList<Mentor>();

  public void addStudent(Student student) {
    this.students.add(student);
  }

  public void addMentor(Mentor mentor) {
    this.mentors.add(mentor);
  }

  public void info() {
    System.out.println("Lagopus " + className + " class has " + students.size() + " students and " + mentors.size() + " mentors.");
  }

  LagopusClass(String className) {
    this.className = className;
    this.students = new ArrayList<Student>();
    this.mentors = new ArrayList<Mentor>();
  }

}

