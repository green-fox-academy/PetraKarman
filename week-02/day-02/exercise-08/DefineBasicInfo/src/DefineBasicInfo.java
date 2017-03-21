/**
 * Created by Petra on 2017. 03. 21..
 */

public class DefineBasicInfo {
  public static void main(String[] args) {
    String name = "Petra Kármán";
    int age = 25;
    double height = 1.61;
    boolean ifMarried = false;

    System.out.println( ("name: " + name) + "\n" + ("age: " + age) + "\n" + ("height: " + height + " meters"));
    if (ifMarried == true)
      System.out.println("married");
    else
      System.out.println("not married");

    // Define several things as a variable than print their values
    // Your name as a string
    // Your age as an integer
    // Your height in meters as a double
    // Wether you are married or not as a boolean
  }
}