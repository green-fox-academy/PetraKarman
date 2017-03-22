/**
 * Created by Petra on 2017. 03. 22..
 */
import java.util.Scanner;
public class Number {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a number:");
    int userInput = scanner.nextInt();
    if (userInput <= 0) {
      System.out.println("Not enough");
    }
    else if (userInput == 1) {
      System.out.println("One");
    }
    else if (userInput == 2) {
      System.out.println("Two");
    }
    else {
      System.out.println("A lot");
    }

  }
}
