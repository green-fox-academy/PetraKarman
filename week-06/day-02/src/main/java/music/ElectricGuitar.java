package main.java.music;

public class ElectricGuitar extends StringedInstrument {


  public ElectricGuitar() {
    super(6);
    name = "Electric Guitar";
    sound = "Twang";
  }

  public ElectricGuitar(int numberOfStrings) {
    super(numberOfStrings, "Twang", "Electric Guitar");
  }

}
