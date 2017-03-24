/**
 * Created by Petra on 2017. 03. 24..
 */

import java.util.Scanner;

public class Anagram {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter two words:");
    String userInput1 = scanner.nextLine();
    String userInput2 = scanner.nextLine();

    System.out.println(anagram(userInput1, userInput2));
  }

  public static boolean anagram(String s1, String s2) {

    (s1) = s1.toLowerCase();
    (s2) = s2.toLowerCase();
    for (int i = 0; i < s1.length(); i++) {
      int firstIndex = s2.indexOf(s1.charAt(i));
      if (firstIndex == -1) {
        return false;
      } else {
        s2 = s2.substring(0, firstIndex) + s2.substring(firstIndex + 1);

      }
    }
    if (s2.length() == 0)
      return true;
    else
      return false;
  }

}


//  Create a function named is anagram following your current language's style guide. It should take two strings and return a boolean value depending on whether its an anagram or not.
//
//        Examples
//
//        input 1	input 2	outut
//        "dog"	"god"	true
//        "green"	"fox"	false