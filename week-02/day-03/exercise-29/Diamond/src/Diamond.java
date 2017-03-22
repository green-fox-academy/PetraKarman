/**
 * Created by Petra on 2017. 03. 22..
 */
import java.util.Scanner;
public class Diamond {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter an integer: ");
    int userInput = scanner.nextInt();

    boolean odd = (userInput % 2 == 1);
    int halfInput = userInput / 2;
    if (odd) {
      halfInput = (halfInput + 1);
    }


    for (int i = 0; i < halfInput; i++) {
      for (int j = 1; j < userInput - i; j++) {
        System.out.print(" ");
      }
      for (int k = 0; k < (2 * i + 1); k++) {
        System.out.print("*");
      }
      if(odd && i == halfInput-2) i++;
      System.out.println();
    }
    for (int i = halfInput-1; i >= 0; i--) {
      for (int j = 1; j < userInput - i; j++) {
        System.out.print(" ");
      }
      for (int k = 0; k < (2 * i + 1); k++) {
        System.out.print("*");
      }

      System.out.println();

      }

    }
  }






// Write a program that reads a number from the standard input, then draws a
// diamond like this:
// */

//
//    *
//   ***
//  *****
// *******
//  *****
//   ***
//    *
//
// The diamond should have as many lines as the number was