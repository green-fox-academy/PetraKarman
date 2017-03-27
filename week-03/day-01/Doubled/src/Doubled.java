import java.io.IOException;
import java.util.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by Petra on 2017. 03. 27..
 */
public class Doubled {
  public static void main(String[] args) {
    Path filePath = Paths.get("duplicated-chars.csv");
    try {
      List<String> lines = Files.readAllLines(filePath);
      for (String row : lines) {
        String singles = "";
        for (int i = 0; i < row.length(); i++) {

          if (i % 2 == 0) {
            singles += row.charAt(i);
          }
        }
        System.out.println(singles);

      }
    } catch (IOException e) {
      System.out.println("béna vagy");


    }

  }

}
