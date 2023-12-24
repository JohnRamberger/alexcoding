package chapter2.part3;

// BIG O NOTATION QUIZ WOOOOOO

enum BigO {
  NONE(""),
  CONSTANT("O(1)"),
  LOGARITHMIC("O(log n)"),
  LINEAR("O(n)"),
  LINEARITHMIC("O(n log n)"),
  QUADRATIC("O(n^2)"),
  CUBIC("O(n^3)"),
  EXPONENTIAL("O(2^n)"),
  FACTORIAL("O(n!)");

  private final String notation;

  BigO(String notation) {
    this.notation = notation;
  }

  public String getNotation() {
    return notation;
  }
}

/**
 * FOR EACH QUESTION, RETURN THE BIG O NOTATION OF THE GIVEN FUNCTION
 * Use the enum BigO to return the correct notation
 * ex: If the function is O(n), return BigO.LINEAR
 * 
 * NOTE: You only have to change the return statement, nothing else
 * 
 * ALSO they are not in order, so you might have to skip around
 */

public class quiz {
  public static void main(String[] args) {
    testAllQuestions();
  }

  static BigO question1() {
    System.out.println("Hello World!");

    return BigO.NONE; // replace with your answer
  }

  static BigO question2(int n) {
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n * n; j++) {
        System.out.println("Hello World!");
      }
    }

    return BigO.NONE; // replace with your answer
  }

  static BigO question3(int n) {
    for (int i = 0; i < n; i++) {
      for (int j = 1; j < n; j = j * 2) {
        System.out.println("Hello World!");
      }
    }

    return BigO.NONE; // replace with your answer
  }

  static BigO question4(int n) {
    for (int i = 0; i < n; i++) {
      System.out.println("Hello World!");
    }

    return BigO.NONE; // replace with your answer
  }

  static BigO question5(int n) {
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n * n; j++) {
        System.out.println("Hello World!");
      }
    }

    return BigO.NONE; // replace with your answer
  }

  static BigO question6(int n) {
    for (int i = 0; i < n; i++) {
      System.out.println("Hello World!");
    }

    for (int i = 0; i < n; i++) {
      System.out.println("Hello World!");
    }

    return BigO.NONE; // replace with your answer
  }

  static BigO question7(int n) {
    for (int i = 0; i < n * n; i++) {
      System.out.println("Hello World!");
    }

    return BigO.NONE; // replace with your answer
  }

  static BigO question8(int n) {
    if (n <= 1) {
      System.out.println("Hello World!");
    } else {
      for (int i = 0; i < n; i++) {
        question8(n - 1);
      }
    }

    return BigO.NONE; // replace with your answer
  }

  static BigO question9() {
    System.out.println("Hello World!");
    System.out.println("Hello World!");
    System.out.println("Hello World!");
    System.out.println("Hello World!");
    System.out.println("Hello World!");
    System.out.println("Hello World!");

    return BigO.NONE; // replace with your answer
  }

  static BigO question10(int n) {
    for (int i = 0; i < n; i++) {
      System.out.println("Hello World!");
    }

    for (int i = 0; i < n * n; i++) {
      System.out.println("Hello World!");
    }

    return BigO.NONE; // replace with your answer
  }

  static BigO question11(int n) {
    for (int i = 1; i < n; i = i * 2) {
      System.out.println("Hello World!");
    }

    return BigO.NONE; // replace with your answer
  }

  static BigO question12() {
    for (int i = 0; i < 20; i++) {
      System.out.println("Hello World!");
    }

    return BigO.NONE; // replace with your answer
  }

  static BigO question13(int n) {
    if (n <= 1) {
      System.out.println("Hello World!");
    } else {
      question13(n - 1);
      question13(n - 1);
    }

    return BigO.NONE; // replace with your answer
  }

  /**
   * TESTS, DO NOT MODIFY OR LOOK AT
   */
  static int n = 3;
  static int incorrect = 0;

  static void testAllQuestions() {
    testQuestion1();
    testQuestion2();
    testQuestion3();
    testQuestion4();
    testQuestion5();
    testQuestion6();
    testQuestion7();
    testQuestion8();
    testQuestion9();
    testQuestion10();
    testQuestion11();
    testQuestion12();
    testQuestion13();

    System.out.println("You got " + (13 - incorrect) + "/13 correct");
  }

  static void testQuestion1() {
    if (question1() == BigO.CONSTANT) {
      System.out.println("Question 1 passed");
    } else {
      System.out.println("Question 1 failed");
      incorrect++;
    }
  }

  static void testQuestion2() {
    if (question2(n) == BigO.CUBIC) {
      System.out.println("Question 2 passed");
    } else {
      System.out.println("Question 2 failed");
      incorrect++;
    }
  }

  static void testQuestion3() {
    if (question3(n) == BigO.LINEARITHMIC) {
      System.out.println("Question 3 passed");
    } else {
      System.out.println("Question 3 failed");
      incorrect++;
    }
  }

  static void testQuestion4() {
    if (question4(n) == BigO.LINEAR) {
      System.out.println("Question 4 passed");
    } else {
      System.out.println("Question 4 failed");
      incorrect++;
    }
  }

  static void testQuestion5() {
    if (question5(n) == BigO.QUADRATIC) {
      System.out.println("Question 5 passed");
    } else {
      System.out.println("Question 5 failed");
      incorrect++;
    }
  }

  static void testQuestion6() {
    if (question6(n) == BigO.LINEAR) {
      System.out.println("Question 6 passed");
    } else {
      System.out.println("Question 6 failed");
      incorrect++;
    }
  }

  static void testQuestion7() {
    if (question7(n) == BigO.QUADRATIC) {
      System.out.println("Question 7 passed");
    } else {
      System.out.println("Question 7 failed");
      incorrect++;
    }
  }

  static void testQuestion8() {
    if (question8(n) == BigO.FACTORIAL) {
      System.out.println("Question 8 passed");
    } else {
      System.out.println("Question 8 failed");
      incorrect++;
    }
  }

  static void testQuestion9() {
    if (question9() == BigO.CONSTANT) {
      System.out.println("Question 9 passed");
    } else {
      System.out.println("Question 9 failed");
      incorrect++;
    }
  }

  static void testQuestion10() {
    if (question10(n) == BigO.QUADRATIC) {
      System.out.println("Question 10 passed");
    } else {
      System.out.println("Question 10 failed");
      incorrect++;
    }
  }

  static void testQuestion11() {
    if (question11(n) == BigO.LOGARITHMIC) {
      System.out.println("Question 11 passed");
    } else {
      System.out.println("Question 11 failed");
      incorrect++;
    }
  }

  static void testQuestion12() {
    if (question12() == BigO.CONSTANT) {
      System.out.println("Question 12 passed");
    } else {
      System.out.println("Question 12 failed");
      incorrect++;
    }
  }

  static void testQuestion13() {
    if (question13(n) == BigO.EXPONENTIAL) {
      System.out.println("Question 13 passed");
    } else {
      System.out.println("Question 13 failed");
      incorrect++;
    }
  }
}
