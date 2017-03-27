import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

/**
 * Created by Petra on 2017. 03. 27..
 */
public class Lotto {
  public static void main(String[] args) {
    Path filePath = Paths.get("otos.csv");
    try {
      List<String> lines = Files.readAllLines(filePath);
      Map<String, Integer> lotto = new HashMap<>();
      for (String row : lines) {
        List<String> rows = Arrays.asList(row.split(";"));
        for (int i = 11; i < rows.size(); i++) {

          if (lotto.containsKey(rows.get(i))) {
            rows.get(i);
            lotto.put(rows.get(i), lotto.get(rows.get(i)) + 1);
          } else {
            lotto.put(rows.get(i), 1);
          }
        }
      }
      for (int i = 0; i < 5; i++) {

        String maxKey = null;
        Integer maxValue = null;

        for (String key : lotto.keySet()) {
          if (maxKey == null) {
            maxKey = key;
          }
          if (maxValue == null) {
            maxValue = lotto.get(key);
          }
          if (maxValue < lotto.get(key)) {
            maxValue = lotto.get(key);
            maxKey = key;
          }
        }

        lotto.remove(maxKey);
        System.out.println(maxKey);
      }

    } catch (IOException e) {
      System.out.println("bena vagy");

    }

  }
}
// Create a method that find the 5 most common lotto numbers assets/lotto.csv