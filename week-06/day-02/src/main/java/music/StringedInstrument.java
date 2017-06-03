package main.java.music;

abstract class StringedInstrument extends Instrument {
  int numberOfStrings;
  final String formatForPlay ="%s, a %d-stringed instrument that %s\n";
  protected String sound;

  public StringedInstrument(int numberOfStrings){
    this.numberOfStrings = numberOfStrings;
  }

  public StringedInstrument(int numberOfStrings, String sound, String name){
    this.numberOfStrings = numberOfStrings;
    this.sound = sound;
    this.name = name;
  }
  @Override
  public void play(){
    System.out.printf(formatForPlay, name, numberOfStrings, sound);
  }


}
