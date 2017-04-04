public class Sponsor extends Person {
  private String company;
  private int hiredStudents;

  @Override
  public void getGoal() {
    System.out.println("Hire brilliant junior software developers.");
  }

  public void introduce() {
    System.out.println("Hi I'm " + getName() + " , a " + getAge() + " year old " + getGender() + " who represents " + company + " hired " + hiredStudents + " so far.");
  }

  public void hire() {
    this.hiredStudents++;
  }

  Sponsor(String name, int age, String gender, String company) {
    super(name, age, gender);
    this.hiredStudents = 0;
  }

  Sponsor() {
    super();
    this.company = "Google";
    this.hiredStudents = 0;

  }
}
