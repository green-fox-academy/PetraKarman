class BlogPost {
  String authorName;
  String title;
  String text;
  String publicationDate;

  BlogPost(String authorName, String title, String text, String publicationDate) {
    this.authorName = authorName;
    this.title = title;
    this.text = text;
    this.publicationDate = publicationDate;

  }
}

public class BlogPostDemo {
  public static void main(String args[]) {
    BlogPost first = new BlogPost("John Doe", "\"Lorem Ipsum\"", "Lorem ipsum dolor sit amet.", "\"2000.05.04.\"");
    BlogPost second = new BlogPost("Tim Urban", "\"Wait but why\"", "A popular long-form, stick-figure-illustrated blog about almost everything.", "\"2010.10.10.\"");
    BlogPost third = new BlogPost("William Turton", "\"One Engineer Is Trying to Get IBM to Reckon With Trump\"", "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing.", "\"2017.03.28.\"");

    System.out.println(first.title + " titled by " + first.authorName + " posted at " + first.publicationDate + "\n" + first.text);
    System.out.println(second.title + " titled by " + second.authorName + " posted at " + second.publicationDate + "\n" + second.text);
    System.out.println(third.title + " titled by " + third.authorName + " posted at " + third.publicationDate + "\n" + third.text);

  }
}
  /*Create a BlogPost class that has
        an authorName
        a title
        a text
        a publicationDate
        Create a few blog post objects:
        "Lorem Ipsum" titled by John Doe posted at "2000.05.04."
        Lorem ipsum dolor sit amet.
        "Wait but why" titled by Tim Urban posted at "2010.10.10."
        A popular long-form, stick-figure-illustrated blog about almost everything.
        "One Engineer Is Trying to Get IBM to Reckon With Trump" titled by William Turton at "2017.03.28."
        Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing.


*/

