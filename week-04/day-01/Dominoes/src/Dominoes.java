import java.util.ArrayList;
import java.util.List;

// You have the list of Dominoes
// Order them into one snake where the adjacent dominoes have the same numbers on their adjacent sides
// eg: [2, 4], [4, 3], [3, 5] ...

public class Dominoes {
  public static void main(String[] args) {
    List<Domino> dominoes = initializeDominoes();
    List<Domino> dominoesOrdered = new ArrayList<>();
    dominoesOrdered.add(dominoes.get(0));
    dominoes.remove(0);

    while (dominoes.size() > 0) {
      int iLast = dominoesOrdered.get(dominoesOrdered.size() - 1).getValues()[1];

      for (int i = 0; i < dominoes.size(); i++) {
        if (dominoes.get(i).getValues()[0] == iLast) {
          dominoesOrdered.add(dominoes.get(i));
          dominoes.remove(i);
        }
      }
    }

    System.out.println(dominoesOrdered);
  }


  static List<Domino> initializeDominoes() {
    List<Domino> dominoes = new ArrayList<>();
    dominoes.add(new Domino(5, 2));
    dominoes.add(new Domino(4, 6));
    dominoes.add(new Domino(1, 5));
    dominoes.add(new Domino(6, 7));
    dominoes.add(new Domino(2, 4));
    dominoes.add(new Domino(7, 1));
    return dominoes;
  }

}
