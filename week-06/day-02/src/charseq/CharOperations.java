package charseq;

public class CharOperations implements CharSequence {
  String string;

  public CharOperations(String string) {
    this.string = string;
  }

  @Override
  public int length() {
    return string.length();
  }

  @Override
  public char charAt(int index) {
    return this.string.charAt(string.length()-1-index);
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    String reversedString = "";
    for (int i = end; i >=start; i--){
      reversedString += this.string.charAt(i);
    }
    return reversedString;
  }

  @Override
  public String toString() {
    return this.subSequence(0, length()-1).toString();
  }
}

 /*Write a class CharOperations that implements the CharSequence interface found in the java.lang package. The task is that all of your implementation should return the string backwards.

   Write a small main method to test your class; make sure to call all four methods(including toString method).*/