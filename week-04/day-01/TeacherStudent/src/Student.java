import java.util.ArrayList;

public class Student {
  private ArrayList<String> knowledge;

  public Student() {
    this.knowledge = new ArrayList<String>();
  }

  public void getKnowledge(String name) {
    System.out.println(name + "'s knowledge:");
    for (String fact : this.knowledge) {
      System.out.println(fact);
    }
  }

  public void learn(String fact) {
    knowledge.add(fact);
  }

  public void question(Teacher teacher, int factNumber) {
    teacher.answer(factNumber);
  }
}
