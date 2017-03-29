import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

// reproduce this:
// [https://github.com/greenfox-academy/teaching-materials/blob/master/exercises/drawing/line-play/r1.png]

public class LinePlay {
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
      drawingFunction2(a, b, graphics);
    }
    for (int i = 0; i < 15; i++) {
      b = b - 20;
      drawingFunction2(a, b, graphics);
    }
  }

  private static void drawingFunction(int x, int y, Graphics graphics) {
    graphics.drawLine(x, y, 30, 0);
    graphics.drawLine(x, y, 295, 290);
  }
  private static void drawingFunction2(int x, int y, Graphics graphics) {
    graphics.drawLine(x, y, 0, 30);
    graphics.drawLine(x, y, 290, 300);
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