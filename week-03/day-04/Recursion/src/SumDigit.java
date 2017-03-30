import java.util.Scanner;

public class SumDigit {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter an integer:");
    int userInput = scanner.nextInt();
    System.out.println(sumDigit(userInput));
  }

  private static int sumDigit(int n) {
    if (n < 10) {
      return n;
    } else {
      System.out.println();
      return (n % 10) + sumDigit(n / 10);

    }
  }
}
// Given a non-negative int n, return the sum of its digits recursively (no loops).
// Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while
// divide (/) by 10 removes the rightmost digit (126 / 10 is 12).