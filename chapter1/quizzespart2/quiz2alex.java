package part2;

public class quiz2alex {
  public static void main(String[] args) {
    String[] before = {"a", "b", "c", "d", "e"};
    String[] after = reverse(before);

    String[] shouldBe = {"e", "d", "c", "b", "a"};

    if (java.util.Arrays.equals(after, shouldBe)) {
      System.out.println("correct!");
    } else {
      System.out.println("incorrect!");
      System.out.println("your answer: " + java.util.Arrays.toString(after));
    }
  }

  static String[] reverse(String[] before) {
    // TODO: Reverse all of the elements in the array. [a,b,c,d,e] -> [e,d,c,b,a]
    // only change inside of this method
    //from here
    // before is a parameter, so you dont need
    int a = 0; // 0, 1, 2, 3, 4b
    String[] mid = new String[5];
    while(a < before.length) {
      int b = (4-a);
      mid[a] = before[b];
      a = a+1;
    }
    
    return mid;
    // to here
  }
}
