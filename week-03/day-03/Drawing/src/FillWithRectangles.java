import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

// draw four different size and color rectangles.

public class FillWithRectangles {

  public static void mainDraw(Graphics graphics) {
    graphics.setColor(Color.MAGENTA);
    graphics.fillRect(10, 30, 40, 40);
    graphics.setColor(Color.CYAN);
    graphics.fillRect(40, 90, 20, 40);
    graphics.setColor(Color.ORANGE);
    graphics.fillRect(170, 200, 75, 35);
    graphics.setColor(Color.PINK);
    graphics.fillRect(220, 130, 50, 30);
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