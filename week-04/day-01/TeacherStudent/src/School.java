public class School {
  public static void main(String[] args) {
    String[] mathTeacherKnowledge = {"2 + 2 = 4",
            "Mathematics is the study of topics such as quantity (numbers), structure, space,nand change."};
    String[] historyteacherKnowledge = {"The Second World War was a global war that lasted from 1939 to 1945.",
            "Vasco da Gama was a Portuguese explorer and the first European to reach India by sea."};
    Teacher mathTeacher = new Teacher(mathTeacherKnowledge);
    Teacher historyTeacher = new Teacher(historyteacherKnowledge);
    Student student1 = new Student();
    Student student2 = new Student();

    mathTeacher.getKnowledge("math teacher");
    System.out.println();
    historyTeacher.getKnowledge("history teacher");

    System.out.println();
    student1.getKnowledge("student1");
    System.out.println();

    historyTeacher.teach(student1, 5);
    System.out.println();
    historyTeacher.teach(student1, 1);

    student2.question(mathTeacher, 10);
    System.out.println();
    student2.question(historyTeacher, 0);

    System.out.println();
    student1.getKnowledge("student1");
    student2.getKnowledge("student2");
  }
}
