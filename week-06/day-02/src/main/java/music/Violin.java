package main.java.music;

public class Violin extends StringedInstrument {


  public Violin() {
    super(4);
    name = "Violin";
    sound = "Screech";
  }

  public Violin(int numberOfStrings) {
    super(numberOfStrings, "Sreech", "Violin");


  }
}
