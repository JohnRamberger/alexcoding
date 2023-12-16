package quizzespart2;

public class yoojin2 {
  public static void main(String[] args) {
    test1();
    test2();
  }
  
  static Integer[] floor(Double[] before) {
    // TODO: Return the floor of each element in the array. [1.1, 2.2, 3.3] -> [1, 2, 3]
    // HINT: Cast each element to an int.
    // only change inside of this method
    //from here


    return new Integer[0];
    // to here
  }

  static void test1() {
    Double[] before = {1.1, 2.2, 3.3};
    Integer[] after = floor(before);

    Integer[] shouldBe = {1, 2, 3};

    if (java.util.Arrays.equals(after, shouldBe)) {
      System.out.println("passes test 1");
    } else {
      System.out.println("fails test 1");
      System.out.println("your answer: " + java.util.Arrays.toString(after));
    }
  }

  static void test2() {
    Double[] before = {6.7, 8.9, 10.11, 12.13, 14.15};
    Integer[] after = floor(before);

    Integer[] shouldBe = {6, 8, 10, 12, 14};

    if (java.util.Arrays.equals(after, shouldBe)) {
      System.out.println("passes test 2");
    } else {
      System.out.println("fails test 2");
      System.out.println("your answer: " + java.util.Arrays.toString(after));
    }
  }
}
