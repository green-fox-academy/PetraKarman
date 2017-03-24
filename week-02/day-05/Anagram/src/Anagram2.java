/**
 * Created by Petra on 2017. 03. 24..
 */

import java.util.Scanner;
import java.util.Arrays;

public class Anagram2 {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter two words:");
    String userInput1 = scanner.nextLine();
    String userInput2 = scanner.nextLine();

    System.out.println(anagram2(userInput1, userInput2));

  }

  public static boolean anagram2(String s1, String s2) {

    char[] s1Array = s1.toLowerCase().toCharArray();
    char[] s2Array = s2.toLowerCase().toCharArray();

    Arrays.sort(s1Array);
    Arrays.sort(s2Array);

    return Arrays.equals(s1Array, s2Array);
  }
}
