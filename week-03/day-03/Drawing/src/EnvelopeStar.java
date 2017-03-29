import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

// reproduce this:
// [https://github.com/greenfox-academy/teaching-materials/blob/master/exercises/drawing/envelope-star/r2.png]


public class EnvelopeStar {


  public static void mainDraw(Graphics graphics) {
    for (int i = 0; i <= 150; i += 10) {
      drawingFunction(i, graphics);
    }
  }

  private static void drawingFunction(int diff, Graphics graphics) {
    graphics.setColor(Color.GREEN);
    graphics.drawLine(150, diff, (150-diff), 150);
    graphics.drawLine(150, diff, (diff + 150), 150);
    graphics.drawLine(diff, 150, 150, (diff + 150));
    graphics.drawLine(150, (300-diff), (diff+150), 150);
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