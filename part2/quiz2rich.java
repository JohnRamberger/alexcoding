package part2;

public class quiz2rich {
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
    

    int i = 0;
    String after[] = new  (before.length)
    while(i < before.length){
      
    }
    return before;
  }
}
