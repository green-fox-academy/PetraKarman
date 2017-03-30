import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

// draw the night sky:
// - The background should be black
// - The stars can be small squares
// - The stars should have random positions on the canvas
// - The stars should have random color (some shade of grey)

public class StarryNight {

  public static void mainDraw(Graphics graphics) {
    int amount = (int) (Math.random() * 100);
    for (int i = 0; i < amount; i++) {
      int posX = (int) (Math.random() * 300);
      int posY = (int) (Math.random() * 300);
      int C = (int) (Math.random() * 256);
      int starSize = (int) (Math.random() * 10);
      Color randomColor = new Color(C, C, C);
      starsFunction(posX, posY, starSize, randomColor, graphics);
    }
  }

  private static void starsFunction(int x, int y, int size, Color color, Graphics graphics) {
    graphics.fillRect(x, y, size, size);

  }

  //    Don't touch the code below
  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(300, 300));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
  }

  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      this.setBackground(Color.BLACK);
      mainDraw(graphics);

    }
  }

}