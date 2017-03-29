import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

// reproduce this:
// [https://github.com/greenfox-academy/teaching-materials/blob/master/exercises/drawing/line-play/r1.png]

public class LinePlay {
  public static void mainDraw(Graphics graphics) {
    for (int i = 0; i < 300; i += 20) {
      drawingFunction(i, graphics);
    }
  }

  private static void drawingFunction(int diff, Graphics graphics) {
    Color color = new Color(177, 70, 244);
    graphics.setColor(color);
    graphics.drawLine(diff, 0, 300, diff);
    graphics.setColor(Color.GREEN);
    graphics.drawLine(0, diff, diff, 300);
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