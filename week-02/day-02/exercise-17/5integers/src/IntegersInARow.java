/**
 * Created by Petra on 2017. 03. 21..
 */
import java.util.Scanner;
public class IntegersInARow {
  public static void main(String[] args) {
    int i1, i2, i3, i4, i5;
    double average;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter an integer:");
    i1 = scanner.nextInt();
    System.out.println("Enter another integer:");
    i2 = scanner.nextInt();
    System.out.println("Enter one more integer:");
    i3 = scanner.nextInt();
    System.out.println("Enter an integer again:");
    i4 = scanner.nextInt();
    System.out.println("Enter the last integer:");
    i5 = scanner.nextInt();



    System.out.println(" the sum is " + (i1 + i2 + i3 + i4 + i5)+ " and the average is: " + ((i1 + i2 + i3 + i4 + i5)/5));


  }
}
// Write a program that asks for 5 integers in a row,
// then it should print the sum and the average of these numbers like:
//
// Sum: 22, Average: 4.4