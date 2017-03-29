import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

// divide the canvas into 4 parts
// and repeat this pattern in each quarter:
// [https://github.com/greenfox-academy/teaching-materials/blob/master/exercises/drawing/line-play/r1.png]

public class LinePlayQuarters {

  public static void mainDraw(Graphics graphics) {

    for (int i = 0; i < 150; i += 10) {
      drawingFunction(i, graphics);
    }
  }

  private static void drawingFunction(int diff, Graphics graphics) {
    Color color = new Color(177, 70, 244);
    graphics.setColor(color);
    graphics.drawLine(diff, 0, 150, diff);
    graphics.drawLine((diff + 150), 0, 300, diff);
    graphics.drawLine(diff, 150, 150, (diff + 150));
    graphics.drawLine((diff + 150), 150, 300, (150 + diff));
    graphics.setColor(Color.GREEN);
    graphics.drawLine(0, diff, diff, 150);
    graphics.drawLine(150, diff, (diff + 150), 150);
    graphics.drawLine(0, (diff + 150), diff, 300);
    graphics.drawLine(150, (diff + 150), (diff + 150), 300);
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