import java.util.Scanner;

public class StringsAgain {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Write something that contains the letter x: ");
    String userInput = scanner.nextLine();
    System.out.println(removeX(userInput));
  }

  private static String removeX(String sentence) {
    if (sentence.length() == 0) {
      return "";
    } else if (sentence.charAt(0) == 'x') {
      return "" + (removeX(sentence.substring(1)));
    } else {
      return sentence.charAt(0) + (removeX(sentence.substring(1)));
    }
  }
}
