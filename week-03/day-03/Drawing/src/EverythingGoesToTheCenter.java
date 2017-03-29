import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

// create a line drawing function that takes 2 parameters:
// the x and y coordinates of the line's starting point
// and draws a line from that point to the center of the canvas.
// fill the canvas with lines from the edges, every 20 px, to the center.


public class EverythingGoesToTheCenter {

  public static void mainDraw(Graphics graphics) {
    int a = 0;
    int b = 0;
    for (int i = 0; i < 15; i++) {
      a = a + 20;
      drawingFunction(a, b, graphics);
    }
    for (int i = 0; i < 15; i++) {
      b = b + 20;
      drawingFunction(a, b, graphics);
    }
    for (int i = 0; i < 15; i++) {
      a = a - 20;
      drawingFunction(a, b, graphics);
    }
    for (int i = 0; i < 15; i++) {
      b = b - 20;
      drawingFunction(a, b, graphics);
    }
  }

  private static void drawingFunction(int x, int y, Graphics graphics) {
    graphics.drawLine(x, y, 150, 150);
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