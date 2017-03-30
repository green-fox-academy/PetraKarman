import java.util.Scanner;

public class Power {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter 2 integers:");
    int userInput = scanner.nextInt();
    int userInput2 = scanner.nextInt();
    System.out.println(power(userInput, userInput2));
  }

  private static int power(int base, int n) {
    if (n == 1) {
      return base;
    } else {
      return base * power(base, n - 1);
    }
  }
}

// Given base and n that are both 1 or more, compute recursively (no loops)
// the value of base to the n power, so powerN(3, 2) is 9 (3 squared).