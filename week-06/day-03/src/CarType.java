import java.util.Random;

public enum CarType {
  SEDAN, COUPE, VAN, TRUCK, CROSSOVER, WAGON;


  public static CarType randomCarType() {
    int pickType = new Random().nextInt(CarType.values().length);
    return CarType.values()[pickType];

  }
}

