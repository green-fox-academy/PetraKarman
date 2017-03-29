
import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ColoredBox {
  public static void mainDraw(Graphics graphics){
    graphics.setColor(Color.BLUE);
    graphics.drawLine(10, 40, 60, 40);
    graphics.setColor(Color.RED);
    graphics.drawLine(10, 80, 60, 80);
    graphics.setColor(Color.YELLOW);
    graphics.drawLine(10, 40, 10, 80);
    graphics.setColor(Color.GREEN);
    graphics.drawLine(60, 40, 60, 80);
    // draw a box that has different colored lines on each edge.



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
  static class ImagePanel extends JPanel{
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);

    }
  }

}