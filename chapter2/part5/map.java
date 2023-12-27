package chapter2.part5;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class map {
  public static void main(String[] args) {
    Map<String, Integer> map = new HashMap<String, Integer>();
    // given a word, keep track of the count of each character within the word
    // hello -> h = 1, e = 1, l = 2, o = 1
    String word = "hello fjdakslfj sdklfjklsj dfksdjfk sdlkfj";

    // for loop is O(n)
    for (String c : word.split("")) {
      // map.get is O(1)
      int count = map.getOrDefault(c, 0);
      count ++;
      // map.put (map.set) is O(1)
      map.put(c, count);
    }

    print(map.toString());
  }

  static void print(String s) {
    System.out.println(s);
  }

  static void print(int s) {
    System.out.println(s);
  }

  static void print(boolean s) {
    System.out.println(s);
  }
}
