import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class GameObject {
  private int posX, posY;
  private int boxSize = Map.boxSize;
  BufferedImage image;

  public GameObject(String filename, int posX, int posY) {
    this.posX = posX;
    this.posY = posY;

    try {
      image = ImageIO.read(new File(filename));
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public void draw(Graphics graphics) {
    if (image != null) {
      graphics.drawImage(image, this.posX * boxSize, this.posY * boxSize, null);
    }
  }
}

