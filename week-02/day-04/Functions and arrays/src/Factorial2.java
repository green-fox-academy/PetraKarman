/**
 * Created by Petra on 2017. 03. 23..
 */

import java.util.Scanner;

public class Factorial2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter an integer:");
    int userInput = scanner.nextInt();
    System.out.println(factorio2(userInput));
  }

  public static int factorio2(int input) {
    if (input == 1)
      return 1;
    else
      return input * factorio2(input - 1);

  }
}
