import java.util.ArrayList;

public class a {
  public static void main(String[] args) {
    ArrayList<String> arr = new ArrayList<>();
    arr.add("1");
    for (int i = 1; i < 10; i++) {
      String last = arr.get(i-1);
      String out = "";
      String curr = "";
      int count = 0;
      for (String c : last.split("")) {
        if (curr.length() == 0){
          curr = c;
          count++;
        } else if (c.equals(curr)) {
          count++;
        } else {
          out += count + curr;
          curr = c;
          count = 1;
        }
      }
      if (count > 0) {
        out += count + curr;
      }

      arr.add(out);
    }
    print(arr.toString());
  }

  static void print(String x) {
    System.out.println(x);
  }
}
