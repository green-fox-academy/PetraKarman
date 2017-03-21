/**
 * Created by Petra on 2017. 03. 21..
 */
import java.util.Scanner;

public class HelloUser {
  public static void main(String[] args) {

    String name;
    Scanner scanner = new Scanner(System.in);
    System.out.print("What's your name?");
    name = scanner.nextLine();
    System.out.println("Hello " + name + "!");
  }
}