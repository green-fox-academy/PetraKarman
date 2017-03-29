import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

// fill the canvas with a checkerboard pattern.

public class Checkerboard {

  public static void mainDraw(Graphics graphics) {
    int x = 0;
    int y = 0;
    for (int i = 0; i <= 15; i++) {
      x = 0;
      for (int j = 0; j <= 15; j++) {
        graphics.setColor(Color.BLACK);
        graphics.fillRect(x, y, 10, 10);
        x = x + 20;
      }
      y = y + 20;
    }
    y = 10;
    for (int i = 0; i <= 15; i++) {
      x = 10;
      for (int j = 0; j <= 15; j++) {
        graphics.setColor(Color.BLACK);
        graphics.fillRect(x, y, 10, 10);
        x = x + 20;
      }
      y = y + 20;
    }

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
      mainDraw(graphics);

    }
  }

}