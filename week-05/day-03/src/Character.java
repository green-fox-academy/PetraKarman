public class Character extends GameObject {

  int posX, posY;
  String image;

  Character(String img, int posX, int posY) {
    super(img, posX, posY);
  }

  public void moveUp() {
    this.setPosY(getPosY() - 1);
  }

  public void moveDown() {
    this.setPosY(getPosY() + 1);

  }

  public void moveRight() {
    this.setPosX(getPosX() + 1);
  }

  public void moveLeft() {
    this.setPosX(getPosX() - 1);
  }

}
