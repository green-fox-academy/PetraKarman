import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.*;

public class Map extends JComponent implements KeyListener {

  int boardWidth, boardHeight;
  public static int[][] wallPosition = new int[][]{
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
  public static int boxSize;
  List<GameObject> allObjects = new ArrayList<>();

  Map(int height, int width, int boxSize) {
    this.boardWidth = width;
    this.boardHeight = height;
    this.boxSize = boxSize;

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

  public int getBoardHeight() {
    return boardHeight;
  }

  public void setBoardHeight() {
    this.boardHeight = boardHeight;
  }

  public int getBoardWidth() {
    return boardWidth;
  }

  public void setBoardWidth() {
    this.boardWidth = boardWidth;
  }


  @Override
  public void paint(Graphics graphics) {
    super.paint(graphics);

    for (GameObject thisObject : allObjects)
      thisObject.draw(graphics);
  }

  @Override
  public void keyTyped(KeyEvent e) {

  }

  @Override
  public void keyPressed(KeyEvent e) {

  }

  @Override
  public void keyReleased(KeyEvent e) {
    Hero oldHeroOb = (Hero) allObjects.get(boardHeight * boardWidth);
    Hero newHeroOb;
    // When the up or down keys hit, we change the position of our box
    int heroTileY = oldHeroOb.getPosY();
    int heroTileX = oldHeroOb.getPosX();
    for (int i = 0; i < boardHeight; i++) {
      for (int j = 0; j < boardWidth; j++) {
        System.out.print(wallPosition[i][j]);
      }
      System.out.println();
    }
    if (e.getKeyCode() == KeyEvent.VK_UP && heroTileY > 0) {
      newHeroOb = new Hero("hero-up.png", heroTileX, heroTileY);
      if (wallPosition[heroTileY - 1][heroTileX] == 0) {
        newHeroOb.moveUp();
        allObjects.set(boardHeight * boardWidth, newHeroOb);
      }
    } else if (e.getKeyCode() == KeyEvent.VK_DOWN && heroTileY < (boardHeight - 1)) {
      newHeroOb = new Hero("hero-down.png", heroTileX, heroTileY);
      System.out.println(wallPosition[heroTileY + 1][heroTileX]);
      if (wallPosition[heroTileY + 1][heroTileX] == 0) {
        newHeroOb.moveDown();
        allObjects.set(boardHeight * boardWidth, newHeroOb);
      }
    } else if (e.getKeyCode() == KeyEvent.VK_RIGHT && heroTileX < (boardWidth - 1)) {
      newHeroOb = new Hero("hero-right.png", heroTileX, heroTileY);
      if (wallPosition[heroTileY][heroTileX + 1] == 0) {
        newHeroOb.moveRight();
        allObjects.set(boardHeight * boardWidth, newHeroOb);
      }
    } else if (e.getKeyCode() == KeyEvent.VK_LEFT && heroTileX > 0) {
      newHeroOb = new Hero("hero-left.png", heroTileX, heroTileY);
      if (wallPosition[heroTileY][heroTileX - 1] == 0) {
        newHeroOb.moveLeft();
        allObjects.set(boardHeight * boardWidth, newHeroOb);
      }
    }
    // and redraw to have a new picture with the new coordinates
    repaint();
  }

  public void getMonster() {
  }
  // giveMeFreeField(){}}
}
