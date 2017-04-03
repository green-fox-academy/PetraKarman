import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Dice {
  //    You have a Dice class which has 6 dice
//    You can roll all of them with roll()
//    Check the current rolled numbers with getCurrent()
//    You can reroll with reroll()
//    Your task is to get where all dice is a 6
  int[] dices = new int[6];

  public int[] roll(){
    for (int i = 0; i < dices.length; i++) {
      dices[i] = (int) (Math.random() * 6) + 1;
    }
    return dices;
  }

  public int[] getCurrent() {
    return dices;
  }

  public int getCurrent(int i) {
    return dices[i];
  }

  public void printDice() {
    for(int i = 0; i < dices.length; i++) {
      System.out.print(dices[i] + " ");
    }
    System.out.println();
  }

  public List<Integer> getNonSixes() {
    List<Integer> nonSixes = new ArrayList<>();
    for(int i = 0; i < dices.length; i++) {
      if(dices[i] != 6) nonSixes.add(i);
    }
    return nonSixes;
  }

  public void rerolls() {
    for (int i = 0; i < dices.length; i++) {
      dices[i] = (int) (Math.random() * 6) + 1;
    }
  }

  public void reroll(int k) {
    dices[k] = (int) (Math.random() * 6) + 1;
  }

  public static void main(String[] args) {
    Dice myDice = new Dice();
    myDice.roll();
    while(myDice.getNonSixes().size() != 0) {
      myDice.printDice();
      for (int i = 0; i < myDice.getNonSixes().size(); i++) {
        myDice.reroll(myDice.getNonSixes().get(i));
      }
    }
    myDice.printDice(); 
  }
}