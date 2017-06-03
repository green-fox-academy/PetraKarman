package main.java.music;

public class Main {
  public static void main(String[] args) {
    CharOperations charOp = new CharOperations("teststring");

    System.out.println(charOp.length());
    System.out.println(charOp.charAt(2));
    System.out.println(charOp.subSequence(0,5));
    System.out.println(charOp.toString());
    System.out.println(charOp.subSequence(0, charOp.length()-1));

  }
}
