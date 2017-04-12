import javax.swing.*;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.*;

public class Map extends JComponent {

  int boardWidth, boardHeight;
  int[][] wallPosition;
  public static int boxSize;
  List<GameObject> allObjects = new ArrayList<>();

  Map(int height, int width, int boxSize) {
    this.boardWidth = width;
    this.boardHeight = height;
    this.boxSize = boxSize;
    this.wallPosition = new int[boardHeight][boardWidth];


    int[][] wallPosition = new int[][]{
            {0, 0, 0, 1, 0, 1, 0, 0, 0, 0},
            {0, 0, 0, 1, 0, 1, 0, 1, 1, 0},
            {0, 1, 1, 1, 0, 1, 0, 1, 1, 0},
            {0, 0, 0, 0, 0, 1, 0, 0, 0, 0},
            {1, 1, 1, 1, 0, 1, 1, 1, 1, 0},
            {0, 1, 0, 1, 0, 0, 0, 0, 1, 0},
            {0, 1, 0, 1, 0, 1, 1, 0, 1, 0},
            {0, 0, 0, 0, 0, 1, 1, 0, 1, 0},
            {0, 1, 1, 1, 0, 0, 0, 0, 1, 0},
            {0, 0, 0, 1, 0, 1, 1, 0, 1, 0},
            {0, 1, 0, 1, 0, 1, 0, 0, 0, 0},
    };

    for (int i = 0; i < boardHeight; i++) {
      for (int j = 0; j < boardWidth; j++) {
        if (wallPosition[i][j] == 0)
          allObjects.add(new Tile(j, i));
        else
          allObjects.add(new Wall(j, i));
      }
    }

    allObjects.add(new Hero("hero-down.png", 0, 0));


    super.setPreferredSize(new Dimension(boardWidth * boxSize, boardHeight * boxSize));
    super.setVisible(true);
  }


  @Override
  public void paint(Graphics graphics) {
    super.paint(graphics);

    for (GameObject thisObject : allObjects)
      thisObject.draw(graphics);
  }
  /*
  ArrayLIst(ArrayList(tiles)) ???
   */

  public void getMonster() {
  }
  // giveMeFreeField(){}}
}
