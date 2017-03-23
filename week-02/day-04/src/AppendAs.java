/**
 * Created by Petra on 2017. 03. 23..
 */
public class AppendAs {
  public static void main(String[] args) {
    String[] nimals = {"kuty", "macsk", "cic"};
    appendAs(nimals[0]);
    appendAs(nimals[1]);
    appendAs(nimals[2]);
  }

  public static void appendAs(String input) {
    System.out.println(input + "a");
  }

}


// - Create an array variable named `nimals`
//   with the following content: `["kuty", "macs", "cic"]`
// - Add all elements an `"a"` at the end