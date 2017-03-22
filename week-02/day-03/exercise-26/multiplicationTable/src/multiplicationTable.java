/**
 * Created by Petra on 2017. 03. 22..
 */
import java.util.Scanner;
public class multiplicationTable {
  public static void main(String args[]) {
    int n, c;
    System.out.println("Enter an integer to see it's multiplication table");
    Scanner in = new Scanner(System.in);
    n = in.nextInt();

    for ( c = 1 ; c <= 10 ; c++ )
      System.out.println(c+"*"+n+" = "+(c*n));
  }

}

// Create a program that asks for a number and prints the multiplication table with that number
//
// Example:
// The number 15 should print:
//
// 1 * 15 = 15
// 2 * 15 = 30
// 3 * 15 = 45
// 4 * 15 = 60
// 5 * 15 = 75
// 6 * 15 = 90
// 7 * 15 = 105
// 8 * 15 = 120
// 9 * 15 = 135
// 10 * 15 = 150







