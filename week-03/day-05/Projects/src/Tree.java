import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Tree {

  public static void mainDraw(Graphics graphics) {
    graphics.setColor(Color.yellow);
    graphics.drawLine(500, 700 + 100, 500, 700);
    drawTree(500, 700, 100, 0, graphics);
  }

  private static void drawTree(int ox, int oy, int line, double angle, Graphics graphics) {
    if (line < 10) {
      return;
    }

    int ldx = ((Double) Math.floor(line * Math.sin(Math.toRadians(angle + 25)))).intValue();
    int ldy = ((Double) Math.floor(line * Math.cos(Math.toRadians(angle + 25)))).intValue();
    int cdx = ((Double) Math.floor(line * Math.sin(Math.toRadians(angle)))).intValue();
    int cdy = ((Double) Math.floor(line * Math.cos(Math.toRadians(angle)))).intValue();
    int rdx = ((Double) Math.floor(line * Math.sin(Math.toRadians(angle - 25)))).intValue();
    int rdy = ((Double) Math.floor(line * Math.cos(Math.toRadians(angle - 25)))).intValue();

    graphics.setColor(Color.yellow);
    graphics.drawLine(ox, oy, ox - ldx, oy - ldy);
    drawTree(ox - ldx, oy - ldy, line - 10, angle + 25, graphics);
    graphics.drawLine(ox, oy, ox - cdx, oy - cdy);
    drawTree(ox - cdx, oy - cdy, line - 9, angle, graphics);
    graphics.drawLine(ox, oy, ox - rdx, oy - rdy);
    drawTree(ox - rdx, oy - rdy, line - 10, angle - 25, graphics);
  }


  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(900, 900));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
  }

  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      Color darkblue = new Color(0, 49, 63);
      this.setBackground(darkblue);
      mainDraw(graphics);

    }
  }
}