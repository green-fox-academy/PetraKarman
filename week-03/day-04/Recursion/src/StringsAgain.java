import java.util.Scanner;

public class StringsAgain {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Write something that contains the letter x: ");
    String userInput = scanner.nextLine();
    System.out.println(remove(userInput));
  }

  private static String remove(String sentence) {
    if (sentence.contains("x")) {
      return sentence.replace("x", "");
    } else {
      return sentence;
    }
  }
}