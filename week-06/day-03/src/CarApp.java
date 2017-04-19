public class CarApp {
  public static void main(String[] args) {
    CarType myType = CarType.randomCarType();
    CarColor myColor = CarColor.randomCarColor();
    Car myCar = new Car(myType, myColor);
    System.out.println(myCar);

    Vehicles newVehicles = new Vehicles();
    System.out.println(newVehicles);

  }
}
