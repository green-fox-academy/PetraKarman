package main.java.music;

public class BassGuitar extends StringedInstrument {


  public BassGuitar() {
    super(4);
    name = "Bass Guitar";
    sound = "Duum-duum-duum";
  }

  public BassGuitar(int numberOfStrings) {
    super(numberOfStrings, "Duum-duum-duum", "Bass Guitar");
  }

}