/**
 * Created by Petra on 2017. 03. 22..
 */
import java.util.Scanner;
public class Bigger {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a number:");
    int userInput1 = scanner.nextInt();
    System.out.println("Enter a number:");
    int userInput2 = scanner.nextInt();

    if (userInput1 > userInput2) {
      System.out.println(userInput1);
    }
    else if (userInput1 < userInput2) {
      System.out.println(userInput2);
    }
    else {
      System.out.println("They are equal");
    }

  }
}
// Write a program that asks for two numbers and prints the bigger one
