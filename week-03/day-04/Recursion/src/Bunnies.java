import java.util.Scanner;

public class Bunnies {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the number of bunnies:");
    int userInput = scanner.nextInt();

    System.out.println(("The number of ears: ") + (bunny(userInput)));
  }

  private static int bunny(int n) {
    if (n == 1) {
      return 2;
    } else {
      return 2 + bunny(n - 1);
    }
  }
}
// We have a number of bunnies and each bunny has two big floppy ears.
// We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).