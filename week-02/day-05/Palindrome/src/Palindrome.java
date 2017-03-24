/**
 * Created by Petra on 2017. 03. 24..
 */

import java.util.Scanner;

public class Palindrome {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter something:");
    String userInput = scanner.nextLine();

    System.out.println(palindrome(userInput));
  }

  public static String palindrome(String input) {
    String temp = input;
    for (int i = 1; i <= input.length(); i++) {
      temp +=input.charAt(input.length() - i);
    }

      return temp;

  }
}
//
//  Create a function named create palindrome following your current language's style guide. It should take a string, create a palindrome from it and then return it.
//
//        Examples
//
//        input	output
//        ""	""
//        "greenfox"	"greenfoxxofneerg"
//        "123"	"123321"