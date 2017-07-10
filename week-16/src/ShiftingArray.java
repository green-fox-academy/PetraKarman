import java.util.Arrays;

public class ShiftingArray {
  public static void main(String[] args) {
    int[] myList = {1, 2, 3, 4, 5};

    System.out.println(Arrays.toString(shift(myList, 2)));
  }

  public static int[] shift(int[] list, int number) {
    int[] lastNumbers = new int[number];
    for (int i = 0; i < number; i++) {
      lastNumbers[i] = list[list.length - number + i];
    }
    for (int i = list.length - number - 1; i >= 0; i--) {
      list[i + number] = list[i];
    }
    for (int i = 0; i < lastNumbers.length; i++) {
      list[i] = lastNumbers[i];
    }
    return list;
  }

  public static int[] shift2(int[] list, int number) {
    int[] shiftedList = new int[list.length];
    for (int i = 0; i < list.length; i++) {
      shiftedList[(i + number) % list.length] = list[i];
    }
    return shiftedList;
  }

}
