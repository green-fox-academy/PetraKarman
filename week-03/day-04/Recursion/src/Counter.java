import java.util.Scanner;

public class Counter {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter an integer:");
    int userInput = scanner.nextInt();
    System.out.println(counter(userInput));
  }

  private static int counter(int n) {
    if (n ==0) {
      return 0;
    } else {
      System.out.println(n);
      return counter(n - 1);
    }

  }
}
// Write a recursive function that takes one parameter: n and counts down from n.
