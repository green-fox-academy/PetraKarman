import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

// reproduce this:
// [https://github.com/greenfox-academy/teaching-materials/blob/master/exercises/drawing/purple-steps-3d/r4.png]

public class PurpleSteps3D {

  public static void mainDraw(Graphics graphics) {

    int x = 10;
    int y = 10;
    int a = 10;
    int p = 0;
    Color color = new Color(177, 70, 244);
    for (int i = 0; i < 6; i++) {
      graphics.setColor(Color.black);
      graphics.fillRect(x, y, a, a);
      graphics.setColor(color);
      graphics.fillRect(x + 1, y + 1, a - 2, a - 2);
      p = p + 10;
      a = a + 10;
      x = x + p;
      y = y + p;
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