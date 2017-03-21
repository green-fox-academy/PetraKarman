/**
 * Created by Petra on 2017. 03. 21..
 */
import java.util.Scanner;

public class Cuboid
{

public static void main(String [] args)
        {
        double l, b, h;
        double area,volume;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of cuboid:");
        l = scanner.nextDouble();
        System.out.print("Enter the breadth of cuboid:");
        b = scanner.nextDouble();
        System.out.print("Enter the height of cuboid:");
        h = scanner.nextDouble();
        area = 2 * ((l * b) + (b * h) + (h * l));
        System.out.println("Surface Area of cuboid:"+area);
        volume=l * b * h;
        System.out.println("Volume of cuboid:"+volume);
        }
        }
