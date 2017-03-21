/**
 * Created by Petra on 2017. 03. 21..
 */
import java.util.Scanner;

public class HelloWorld {


    public static void main(String[] args) {
        System.out.println("Ez a gyerek olyan \n\"okos\"...");
        System.out.println(true);
        byte b = 127;
        short peaches = 1;
        int apples = 123;
        long pears = 1233;
        System.out.println(peaches--);
        System.out.println("alma" == "alma");
        boolean isMarried = true;
        String text = "majom";
        double pi = 3.14;
        Scanner scanner = new Scanner (System.in);
        String line = scanner.nextLine();
        System.out.println(line);

    }
}