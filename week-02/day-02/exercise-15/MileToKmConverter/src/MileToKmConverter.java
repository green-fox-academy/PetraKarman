/**
 * Created by Petra on 2017. 03. 21..
 */
import java.util.Scanner;

public class MileToKmConverter {
  public static void main(String[] args) {
    int km;
    double miles;

    Scanner scanner = new Scanner(System.in);
    System.out.print ("Enter a distance in kilometers:");
    km = scanner.nextInt();
    miles = 0.621371192 * km;
    System.out.println(km + " kilometers = " + miles + "miles");
    // Write a program that asks for an integer that is a distance in kilometers,
    // then it converts that value to miles and prints it
  }
}
