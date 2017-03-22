/**
 * Created by Petra on 2017. 03. 22..
 */
import java.util.Scanner;
public class Triangle {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter an integer: ");
    int userInput = scanner.nextInt();



    for (int i = 0; i < userInput; i++) {
      String temp = " ";
      for (int j = 0; j < i+1; j++) {
        temp += "*";
      }

        System.out.println(temp);
      }
    }
  }



// Write a program that reads a number from the standard input, then draws a
// triangle like this:
//
// *
// **
// ***
// ****
//
// The triangle should have as many lines as the number was

