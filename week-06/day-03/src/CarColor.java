import java.util.Random;

public enum CarColor {
  RED, BLUE, BLACK, WHITE, SILVER, GOLD;


  public static CarColor randomCarColor(){
    int pickColor = new Random().nextInt(CarColor.values().length);
    return CarColor.values()[pickColor];
  }
}
