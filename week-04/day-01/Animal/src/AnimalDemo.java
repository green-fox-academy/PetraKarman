public class AnimalDemo {
  public static void main(String[] args) {
    Animal elephant = new Animal();
    Animal lion = new Animal();

    System.out.println("elephant " + elephant);
    System.out.println("lion " + lion);

    elephant.eat();
    System.out.println("elephant after dinner: " + elephant);

    lion.play();
    System.out.println("lion after playing soccer: " + lion);
  }
}
