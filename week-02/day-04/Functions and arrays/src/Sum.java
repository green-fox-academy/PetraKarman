/**
 * Created by Petra on 2017. 03. 23..
 */

import java.util.Scanner;

public class Sum {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter an integer:");
    int userInput1 = scanner.nextInt();
    sum(userInput1);
  }
  public static void sum(int input) {
    int sum = 0;
    for (int i = 1; i <= input; i++) {
      sum = sum + i;
    }
    System.out.println(sum);
  }
}
//  Create the usual class wrapper
//  and main method on your own.

// - Write a function called `sum` that sum all the numbers
//   until the given parameter