import java.util.Scanner;

public class NumberAdder {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter an integer:");
    int userInput = scanner.nextInt();
    System.out.println(numberAdder(userInput));
  }

  private static int numberAdder(int n) {
    if (n == 1) {
      return 1;
    } else {
      return n + numberAdder(n - 1);

    }
  }
}
// Write a recursive function that takes one parameter: n and adds numbers from 1 to n.
