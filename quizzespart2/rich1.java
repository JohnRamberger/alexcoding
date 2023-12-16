package quizzespart2;

public class rich1 {
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
    Boolean[] newbefore = {};
    for (int i = 0; i < before.length; i = i + 1){
      a ;
      newbefore[a] = before[a];
    
    }

    return before;
    // to here
  }
}
