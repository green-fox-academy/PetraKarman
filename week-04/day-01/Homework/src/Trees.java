import java.util.HashMap;
import java.util.Map;

public class Trees {

  public static void main(String[] args) {
    Map<String, String> tree1 = new HashMap<>();
    Map<String, String> tree2 = new HashMap<>();
    Map<String, String> tree3 = new HashMap<>();
    Map<String, String> tree4 = new HashMap<>();
    Map<String, String> tree5 = new HashMap<>();

    tree1.put("type", "pine");
    tree1.put("leaf color", "green");
    tree1.put("age", "70");
    tree1.put("sex", "male");
    tree2.put("type", "apple");
    tree2.put("leaf color", "green");
    tree2.put("age", "10");
    tree2.put("sex", "female");
    tree3.put("type", "birch");
    tree3.put("leaf color", "green");
    tree3.put("age", "25");
    tree3.put("sex", "male");
    tree4.put("type","oak");
    tree4.put("leaf color", "green");
    tree4.put("age", "50");
    tree4.put("sex", "male");
    tree5.put("type", "maple");
    tree5.put("leaf color", "red");
    tree5.put("age", "28");
    tree5.put("sex", "female");

    System.out.println(tree1);
    System.out.println(tree2);
    System.out.println(tree3);
    System.out.println(tree4);
    System.out.println(tree5);

  }
}

/*Create 5 trees
Store the data of them in variables in your program
for every tree the program should store its'
type
leaf color
age
sex
you can use just variables, or lists and/or maps
*/
