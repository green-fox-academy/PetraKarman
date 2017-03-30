import java.util.Scanner;

public class Strings {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Write something that contains the letter x: ");
    String userInput = scanner.nextLine();
    System.out.println(changeXY(userInput));
  }

  private static String changeXY(String sentence) {
    if (sentence.length() == 0) {
      return "";
    } else if (sentence.charAt(0) == 'x') {
      return 'y' + (changeXY(sentence.substring(1)));
    } else {
      return sentence.charAt(0) + (changeXY(sentence.substring(1)));
    }
  }
}
