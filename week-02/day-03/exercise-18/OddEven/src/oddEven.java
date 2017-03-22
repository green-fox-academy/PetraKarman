/**
 * Created by Petra on 2017. 03. 22..
 */
import java.util.Scanner;

public class oddEven {
  public static void main(String[] args) {

  Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a number:");
  int userInput = scanner.nextInt();
  if (userInput % 2 == 0){
      System.out.println("Even");
    }
  else {
      System.out.println("Odd");
    }
  }
}


// Write a program that reads a number form the standard input,
// Than prints "Odd" if the number is odd, or "Even" it it is even.

