public class Teacher {

  private String[] knowledge;

  public Teacher(String[] knowledge) {
    this.knowledge = knowledge;
  }

  public void getKnowledge(String name) {
    System.out.println(name + "'s knowledge:");
    for (String fact : this.knowledge) {
      System.out.println(fact);
    }
  }

  public void answer(int factNumber) {
    if (factNumber > knowledge.length - 1) {
      System.out.println("I have no idea.");
    } else {
      System.out.println("The answer is: " + knowledge[factNumber]);
    }
  }

  public void teach(Student student, int factNumber) {
    if (factNumber > knowledge.length - 1) {
      System.out.println("How could I teach this shit.");
    } else {
      student.learn(knowledge[factNumber]);
    }
  }

}


/*Create Student and Teacher classes
Student
learn()
question(teacher) -> calls the teachers answer method
Teacher
teach(student) -> calls the students learn method
answer()*/
