/**
 * Created by Petra on 2017. 03. 21..
 */

public class VariableMutation {
  public static void main(String[] args) {
    int a = 3;
    a += 10;



    System.out.println(a);




    int b = 100;
    b -= 7;


    System.out.println(b);




    int c = 44;
    c *= 2;


    System.out.println(c);




    int d = 125;
    d /= 5;


    System.out.println(d);




    int e = 8;
    e *= e;
    e *= e;

    System.out.println(e);




    int f1 = 123;
    int f2 = 345;
    boolean isBigger;
    if (f1 > f2) isBigger = true;
    else isBigger = false;

    System.out.println(isBigger);
    // tell if f1 is bigger than f2 (print as a boolean)





    int g1 = 350;
    int g2 = 200;
    boolean doubleIsBigger;
    if ((2 * g2) > g1) doubleIsBigger = true;
    else doubleIsBigger = false;
    System.out.println(doubleIsBigger);
    // tell if the double of g2 is bigger than g1 (print as a boolean)




    double h = 1357988018575474.0;
    boolean divisor;
    if ((h % 11 == 0))divisor = true;
    else divisor = false;
    System.out.println(divisor);
    // tell if it has 11 as a divisor (print as a boolean)






    int i1 = 10;
    int i2 = 3;
    boolean higherSmaller;
    if ((i1 > i2) && (i1 < (i2 * i2 * i2))) higherSmaller = true;
    else higherSmaller = false;
    System.out.println(higherSmaller);
    // tell if i1 is higher than i2 squared and smaller than i2 cubed (print as a boolean)




    int j = 1521;
    boolean dividable;
    if ((j % 3 == 0) || (j % 5 == 0)) dividable = true;
    else dividable = false;
    System.out.println(dividable);
    // tell if j is dividable by 3 or 5 (print as a boolean)




    String k = "Apple";
    k = k + k + k + k;
    //fill the k variable with its cotnent 4 times


    System.out.println(k);
  }
}