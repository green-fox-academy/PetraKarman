import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Board extends JComponent implements KeyListener {

  int heroBoxX;
  int heroBoxY;
  final int boxSize = 72;
  final int boardWidth = 10 * boxSize;
  final int boardHeight = 11 * boxSize;
  String heroImage, skeletonImage;
  int[][] wallPosition = new int[][]{
          {0, 0, 0, 1, 0, 1, 0, 0, 0, 0},
          {0, 0, 0, 1, 0, 1, 0, 1, 1, 0},
          {0, 1, 1, 1, 0, 1, 0, 1, 1, 0},
          {0, 0, 0, 0, 0, 1, 0, 0, 0, 0},
          {1, 1, 1, 1, 0, 1, 1, 1, 1, 0},
          {0, 1, 0, 1, 0, 0, 0, 0, 1, 0,},
          {0, 1, 0, 1, 0, 1, 1, 0, 1, 0},
          {0, 0, 0, 0, 0, 1, 1, 0, 1, 0,},
          {0, 1, 1, 1, 0, 0, 0, 0, 1, 0},
          {0, 0, 0, 1, 0, 1, 1, 0, 1, 0},
          {0, 1, 0, 1, 0, 1, 0, 0, 0, 0},
  };

  public Board() {
    heroBoxX = 0;
    heroBoxY = 0;
    heroImage = "hero-down.png";
    skeletonImage = "skeleton.png";


    // set the size of your draw board
    super.setPreferredSize(new Dimension(boardWidth, boardHeight));
    super.setVisible(true);
  }

  @Override
  public void paint(Graphics graphics) {
    super.paint(graphics);

    PositionedImage floorImage = new PositionedImage("floor.png", 0, 0);
    PositionedImage wallImage = new PositionedImage("wall.png", 0, 0);
    PositionedImage hero = new PositionedImage(heroImage, heroBoxX, heroBoxY);

    for (int y = 0; y < 11; y++) {
      for (int x = 0; x < 10; x++) {
        if (wallPosition[y][x] == 1) {
          wallImage.posY = (y * boxSize);
          wallImage.posX = (x * boxSize);
          wallImage.draw(graphics);
        } else {
          floorImage.posY = (y * boxSize);
          floorImage.posX = (x * boxSize);
          floorImage.draw(graphics);
        }
      }
    }
    hero.draw(graphics);
  }

  // To be a KeyListener the class needs to have these 3 methods in it
  @Override
  public void keyTyped(KeyEvent e) {

  }

  @Override
  public void keyPressed(KeyEvent e) {

  }

  // But actually we can use just this one for our goals here
  @Override
  public void keyReleased(KeyEvent e) {
    // When the up or down keys hit, we change the position of our box
    int heroTileY = heroBoxY / boxSize;
    int heroTileX = heroBoxX / boxSize;
    if (e.getKeyCode() == KeyEvent.VK_UP && heroBoxY > 0) {
      heroImage = "hero-up.png";
      if (wallPosition[heroTileY - 1][heroTileX] == 0)
        heroBoxY -= boxSize;
    } else if (e.getKeyCode() == KeyEvent.VK_DOWN && heroBoxY < (boardHeight - boxSize)) {
      heroImage = "hero-down.png";
      if (wallPosition[heroTileY + 1][heroTileX] == 0)
        heroBoxY += boxSize;
    } else if (e.getKeyCode() == KeyEvent.VK_RIGHT && heroBoxX < (boardWidth - boxSize)) {
      heroImage = "hero-right.png";
      if (wallPosition[heroTileY][heroTileX + 1] == 0)
        heroBoxX += boxSize;
    } else if (e.getKeyCode() == KeyEvent.VK_LEFT && heroBoxX > 0) {
      heroImage = "hero-left.png";
      if (wallPosition[heroTileY][heroTileX - 1] == 0)
        heroBoxX -= boxSize;
    }
    // and redraw to have a new picture with the new coordinates
    repaint();
  }
}
