/**
 * Created by Petra on 2017. 03. 21..
 */
import java.util.Scanner;
public class AnimalsAndLegs {
  public static void main(String[] args) {
    int chicken, pig, chickenLegs, pigLegs;
    Scanner scanner = new Scanner(System.in);
    System.out.println("How many chickens does the farmer have?");
    chicken = scanner.nextInt();
    System.out.println("How many pigs does the farmer have?");
    pig = scanner.nextInt();
    System.out.println("Chickens and pigs have " + ((2 * chicken)+ (4 * pig) )+ " legs together.");


    // Write a program that asks for two integers
    // The first represents the number of chickens the farmer has
    // The seconf represents the number of pigs the farmer has
    // It should print how many legs all the animals have
  }
}