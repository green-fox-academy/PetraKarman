import java.util.Scanner;

public class Strings {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Write something that contains the letter x: ");
    String userInput = scanner.nextLine();
    System.out.println(replace(userInput));
  }

  private static String replace(String sentence) {
    if (sentence.contains("x")) {
      return sentence.replace("x", "y");
    } else {
      return sentence;
    }
  }
}
// Given a string, compute recursively (no loops) a new string where all the
// lowercase 'x' chars have been changed to 'y' chars.
