package quizzespart2;

public class yoojin3 {
  public static void main(String[] args) {
    test1();
    test2();
  }
  
  static String concatenate(String[] before) {
    // TODO: Return the concatenation of each element in the array. ["a", "b", "c"] -> "abc"
    // NOTE: You are returning a String, not a String[].
    // only change inside of this method
    //from here


    return "";
    // to here
  }

  static void test1() {
    String[] before = {"a", "b", "c"};
    String after = concatenate(before);

    String shouldBe = "abc";

    if (after.equals(shouldBe)) {
      System.out.println("passes test 1");
    } else {
      System.out.println("fails test 1");
      System.out.println("your answer: " + after);
    }
  }

  static void test2() {
    String[] before = {"Why", " ", "hello", " ", "there", " ", "friend"};
    String after = concatenate(before);

    String shouldBe = "Why hello there friend";

    if (after.equals(shouldBe)) {
      System.out.println("passes test 2");
    } else {
      System.out.println("fails test 2");
      System.out.println("your answer: " + after);
    }
  }
}
