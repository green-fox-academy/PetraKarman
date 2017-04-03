class PostIt {
  String backgroundColor;
  String text;
  String textColor;

  PostIt(String backgroundColor, String text, String textColor) {
    this.backgroundColor = backgroundColor;
    this.text = text;
    this.textColor = textColor;
  }
}

public class PostItDemo {
  public static void main(String args[]) {
    PostIt first = new PostIt("orange","Idea 1", "blue");
    PostIt second = new PostIt("pink", "Awesome", "black");
    PostIt third = new PostIt("yellow", "Superb!", "green");

    System.out.println("This PostIt is " + first.backgroundColor + " with " + first.textColor+ " text"+ " saying " + first.text + ".");
    System.out.println("This PostIt is " + second.backgroundColor + " with " + second.textColor+ " text"+ " saying " + second.text + ".");
    System.out.println("This PostIt is " + third.backgroundColor + " with " + third.textColor+ " text"+ " saying " + third.text + ".");

  }
}
 /* Create a PostIt class that has
        a backgroundColor
        a text on it
        a textColor
        Create a few example post-it objects:
        an orange with blue text: "Idea 1"
        a pink with black text: "Awesome"
        a yellow with green text: "Superb!"*/