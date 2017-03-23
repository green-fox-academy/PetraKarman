/**
 * Created by Petra on 2017. 03. 23..
 */

import java.util.Scanner;

public class PrintArguments {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Write something nice: ");
    String userInput = scanner.nextLine();
    printer(userInput);
  }

  public static void printer(String input) {
    System.out.println(input);
  }
}

//  Create the usual class wrapper
//  and main method on your own.

// - Create a function called `printer`
//   which prints the input String parameters
// - It can have any number of parameters

// Examples
// printer("first")
// printer("first", "second")
// printer("first", "second", "third", "fourh")
// ...