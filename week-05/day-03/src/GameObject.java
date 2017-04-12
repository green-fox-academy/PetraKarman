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

  public int getPosX() {
    return posX;
  }

  public void setPosX(int posX) {
    this.posX = posX;
  }

  public int getPosY() {
    return posY;
  }

  public void setPosY(int posY) {
    this.posY = posY;
  }

  public int getBoxSize() {
    return boxSize;
  }

  public void setBoxSize() {
    this.boxSize = boxSize;
  }

  public BufferedImage getImage() {
    return image;
  }

  public void setImage() {
    this.image = image;
  }
}

