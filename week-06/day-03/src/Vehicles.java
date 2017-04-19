import java.util.ArrayList;
import java.util.List;

public class Vehicles {
  List<Car> carList = new ArrayList<>();

  public Vehicles() {
    fillVehicles();

  }

  private void fillVehicles() {
    for (int i = 0; i < 256; i++) {
      carList.add(new Car(CarType.randomCarType(), CarColor.randomCarColor()));
    }
  }

  private int sumColors(CarColor color) {
    int sumOfColors = 0;
    for (Car x : carList) {
      if (x.myCarColor.equals(color)) {
        sumOfColors++;
      }
    }

    return sumOfColors;
  }

  private int sumTypes(CarType type) {
    int sumOfTypes = 0;
    for (Car x : carList) {
      if (x.myCarType.equals(type)) {
        sumOfTypes++;
      }
    }
    return sumOfTypes;
  }


  @Override
  public String toString() {
    String typesAndSums = "";
    for (int i = 0; i < CarType.values().length; i++) {
      typesAndSums += CarType.values()[i].name() + " " + sumTypes(CarType.values()[i]) + "\n";
    }
    String colorsAndSums = "";
    for (int i = 0; i < CarColor.values().length; i++) {
      colorsAndSums += CarColor.values()[i].name() + " " + sumColors(CarColor.values()[i]) + "\n";
    }

    return typesAndSums + "\n" + colorsAndSums;

  }
}

