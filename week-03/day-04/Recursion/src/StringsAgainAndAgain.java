import java.util.Scanner;

public class StringsAgainAndAgain {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Write something: ");
    String userInput = scanner.nextLine();
    System.out.println(separate(userInput));
  }

  private static String separate(String sentence) {
    if (sentence.length() == 1) {
      return sentence.charAt(0)+"";
    } else {
      return sentence.charAt(0) + "*" + (separate(sentence.substring(1)));
    }
  }
}
// Given a string, compute recursively a new string where all the
// adjacent chars are now separated by a "*".