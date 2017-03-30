import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.lang.reflect.Array;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

// create a function that takes 1 parameter:
// an array of {x, y} points
// and connects them with green lines.
// connect these to get a box: {{10, 10}, {290,  10}, {290, 290}, {10, 290}}
// connect these: {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70},
// {120, 100}, {85, 130}, {50, 100}}


public class ConnectTheDots {

  public static void mainDraw(Graphics graphics) {
    int[][] pointsBox = {{10, 10}, {290, 10}, {290, 290}, {10, 290}};
    int[][] pointsOther = {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70}, {120, 100}, {85, 130}, {50, 100}};

    connectingFunction(pointsBox, graphics);
    connectingFunction(pointsOther, graphics);
  }

  private static void connectingFunction(int[][] dots, Graphics graphics) {
    graphics.setColor(Color.GREEN);

    for (int i = 0; i < (dots.length) - 1; i++) {
      graphics.drawLine(dots[i][0], dots[i][1], dots[i + 1][0], dots[i + 1][1]);
    }
    graphics.drawLine(dots[dots.length - 1][0], dots[dots.length - 1][1], dots[0][0], dots[0][1]);
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


// create a 300x300 canvas.