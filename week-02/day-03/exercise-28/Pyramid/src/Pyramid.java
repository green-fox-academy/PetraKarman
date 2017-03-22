/**
 * Created by Petra on 2017. 03. 22..
 */
import java.util.Scanner;

public class Pyramid {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter an integer: ");
    int userInput = scanner.nextInt();

    for(int i=0;i< userInput; i++) {
      for(int j=1;j<userInput-i;j++) {
        System.out.print(" ");
      }
      for(int k=0;k<(2*i+1);k++) {
        System.out.print("*");
      }
      System.out.println();
    }

  }
  }




// Write a program that reads a number from the standard input, then draws a
// pyramid like this:
//
//
//    *
//   ***
//  *****
// *******
//
// The pyramid should have as many lines as the number was