package quizzespart2;

public class alex1 {
  public static void main(String[] args) {
    Boolean[] before = {true, false, true};
    Boolean[] after = opposite(before);

    Boolean[] shouldBe = {false, true, false};

    if (java.util.Arrays.equals(after, shouldBe)) {
      System.out.println("correct!");
    } else {
      System.out.println("incorrect!");
      System.out.println("your answer: " + java.util.Arrays.toString(after));
    }
  }

  static Boolean[] opposite(Boolean[] before) { 
    // TODO: Return the opposite of each element in the array. [true, false, true] -> [false, true, false]
    // only change inside of this method
    //from here
    int a = 0;
    while(a < before.length) {
      if (before[a] == false) {
        before[a] = true;
      } else if (before[a] == true) {
        before[a] = false;
      }
      
      a = a + 1;
    }

    return before;
    // to here
  }
}
