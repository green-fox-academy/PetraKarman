import java.util.Arrays;

public class SplitString {
  public static void main(String[] args) {
    System.out.println(Arrays.asList(splitString("lovebarbara", 4)));
  }

  public static String[] splitString(String input, int indexOfSplit) {
    String[] splitInput = new String[2];
    try {
      splitInput[0] = input.substring(0, indexOfSplit);
      splitInput[1] = input.substring(indexOfSplit);
    } catch (IndexOutOfBoundsException e) {
      System.out.println("the given number is bigger than the length of the string");
    }
    return splitInput;

  }
}

/*
Write a function that receives a string and an integer
The function should return an array of strings, with two string in it
The first string should be the first part of the original string
Characters in range [0,index-1].
The second part should be the rest of the string characters range [index,length-1]
Example: split("lovebarbara", 4)
Result: {"love", "barbara"}
Handle the exception if the index is out of bounds

 */
