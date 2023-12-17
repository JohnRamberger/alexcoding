package fundamentals;

public class quiz1_check {
  public static void main(String[] args) {
    test_problem1();
    test_problem2();
    test_problem3();
    test_problem4();
    test_problem5();
    test_problem6();
    test_problem7();
    test_problem8();
    test_problem9();
    test_problem10();
  }

  static void test_problem1() {
    int a = 1;
    int b = 2;
    int expected = 3;
    int actual = quiz1.problem1_sum(a, b);
    if (actual != expected) {
      System.out.println("problem1_sum failed");
      System.out.println("expected: " + expected);
      System.out.println("actual: " + actual);
    } else {
      System.out.println("problem1_sum passed");
    }
  }

  static void test_problem2() {
    int a1 = 1;
    int expected1 = 1;
    int actual1 = quiz1.problem2_square(a1);
    if (actual1 != expected1) {
      System.out.println("problem2_square failed");
      System.out.println("expected: " + expected1);
      System.out.println("actual: " + actual1);
    } else {
      System.out.println("problem2_square passed");
    }

    int a2 = 2;
    int expected2 = 4;
    int actual2 = quiz1.problem2_square(a2);
    if (actual2 != expected2) {
      System.out.println("problem2_square failed");
      System.out.println("expected: " + expected2);
      System.out.println("actual: " + actual2);
    } else {
      System.out.println("problem2_square passed");
    }
  }

  static void test_problem3() {
    int numerator1 = 1;
    int denominator1 = 2;
    double expected1 = 0.5;
    double actual1 = quiz1.problem3_division(numerator1, denominator1);
    if (actual1 != expected1) {
      System.out.println("problem3_division failed");
      System.out.println("expected: " + expected1);
      System.out.println("actual: " + actual1);
    } else {
      System.out.println("problem3_division passed");
    }

    int numerator2 = 2;
    int denominator2 = 1;
    double expected2 = 2.0;
    double actual2 = quiz1.problem3_division(numerator2, denominator2);
    if (actual2 != expected2) {
      System.out.println("problem3_division failed");
      System.out.println("expected: " + expected2);
      System.out.println("actual: " + actual2);
    } else {
      System.out.println("problem3_division passed");
    }
  }

  static void test_problem4() {
    int a1 = 1;
    int b1 = 2;
    int c1 = 3;
    int expected1 = 3;
    int actual1 = quiz1.problem4_largest(a1, b1, c1);
    if (actual1 != expected1) {
      System.out.println("problem4_largest failed");
      System.out.println("expected: " + expected1);
      System.out.println("actual: " + actual1);
    } else {
      System.out.println("problem4_largest passed");
    }

    int a2 = 2;
    int b2 = 1;
    int c2 = 3;
    int expected2 = 3;
    int actual2 = quiz1.problem4_largest(a2, b2, c2);
    if (actual2 != expected2) {
      System.out.println("problem4_largest failed");
      System.out.println("expected: " + expected2);
      System.out.println("actual: " + actual2);
    } else {
      System.out.println("problem4_largest passed");
    }

    int a3 = 3;
    int b3 = 2;
    int c3 = 1;
    int expected3 = 3;
    int actual3 = quiz1.problem4_largest(a3, b3, c3);
    if (actual3 != expected3) {
      System.out.println("problem4_largest failed");
      System.out.println("expected: " + expected3);
      System.out.println("actual: " + actual3);
    } else {
      System.out.println("problem4_largest passed");
    }
  }

  static void test_problem5() {
    int a1 = 1;
    boolean expected1 = false;
    boolean actual1 = quiz1.problem5_even(a1);
    if (actual1 != expected1) {
      System.out.println("problem5_even failed");
      System.out.println("expected: " + expected1);
      System.out.println("actual: " + actual1);
    } else {
      System.out.println("problem5_even passed");
    }

    int a2 = 2;
    boolean expected2 = true;
    boolean actual2 = quiz1.problem5_even(a2);
    if (actual2 != expected2) {
      System.out.println("problem5_even failed");
      System.out.println("expected: " + expected2);
      System.out.println("actual: " + actual2);
    } else {
      System.out.println("problem5_even passed");
    }
  }

  static void test_problem6() {
    int a1 = 1;
    boolean expected1 = true;
    boolean actual1 = quiz1.problem6_odd(a1);
    if (actual1 != expected1) {
      System.out.println("problem6_odd failed");
      System.out.println("expected: " + expected1);
      System.out.println("actual: " + actual1);
    } else {
      System.out.println("problem6_odd passed");
    }

    int a2 = 2;
    boolean expected2 = false;
    boolean actual2 = quiz1.problem6_odd(a2);
    if (actual2 != expected2) {
      System.out.println("problem6_odd failed");
      System.out.println("expected: " + expected2);
      System.out.println("actual: " + actual2);
    } else {
      System.out.println("problem6_odd passed");
    }
  }

  static void test_problem7() {
    boolean a1 = true;
    boolean expected1 = false;
    boolean actual1 = quiz1.problem7_opposite(a1);
    if (actual1 != expected1) {
      System.out.println("problem7_opposite failed");
      System.out.println("expected: " + expected1);
      System.out.println("actual: " + actual1);
    } else {
      System.out.println("problem7_opposite passed");
    }

    boolean a2 = false;
    boolean expected2 = true;
    boolean actual2 = quiz1.problem7_opposite(a2);
    if (actual2 != expected2) {
      System.out.println("problem7_opposite failed");
      System.out.println("expected: " + expected2);
      System.out.println("actual: " + actual2);
    } else {
      System.out.println("problem7_opposite passed");
    }
  }

  static void test_problem8() {
    boolean a1 = true;
    boolean b1 = true;
    boolean c1 = true;
    boolean expected1 = true;
    boolean actual1 = quiz1.problem8_atleast2(a1, b1, c1);
    if (actual1 != expected1) {
      System.out.println("problem8_atleast2 failed");
      System.out.println("expected: " + expected1);
      System.out.println("actual: " + actual1);
    } else {
      System.out.println("problem8_atleast2 passed");
    }

    boolean a2 = true;
    boolean b2 = true;
    boolean c2 = false;
    boolean expected2 = true;
    boolean actual2 = quiz1.problem8_atleast2(a2, b2, c2);
    if (actual2 != expected2) {
      System.out.println("problem8_atleast2 failed");
      System.out.println("expected: " + expected2);
      System.out.println("actual: " + actual2);
    } else {
      System.out.println("problem8_atleast2 passed");
    }

    boolean a3 = true;
    boolean b3 = false;
    boolean c3 = true;
    boolean expected3 = true;
    boolean actual3 = quiz1.problem8_atleast2(a3, b3, c3);
    if (actual3 != expected3) {
      System.out.println("problem8_atleast2 failed");
      System.out.println("expected: " + expected3);
      System.out.println("actual: " + actual3);
    } else {
      System.out.println("problem8_atleast2 passed");
    }

    boolean a4 = false;
    boolean b4 = true;
    boolean c4 = true;
    boolean expected4 = true;
    boolean actual4 = quiz1.problem8_atleast2(a4, b4, c4);
    if (actual4 != expected4) {
      System.out.println("problem8_atleast2 failed");
      System.out.println("expected: " + expected4);
      System.out.println("actual: " + actual4);
    } else {
      System.out.println("problem8_atleast2 passed");
    }
  }

  static void test_problem9() {
    double a1 = 1.0;
    int expected1 = 1;
    int actual1 = quiz1.problem9_floor(a1);
    if (actual1 != expected1) {
      System.out.println("problem9_floor failed");
      System.out.println("expected: " + expected1);
      System.out.println("actual: " + actual1);
    } else {
      System.out.println("problem9_floor passed");
    }

    double a2 = 1.9;
    int expected2 = 1;
    int actual2 = quiz1.problem9_floor(a2);
    if (actual2 != expected2) {
      System.out.println("problem9_floor failed");
      System.out.println("expected: " + expected2);
      System.out.println("actual: " + actual2);
    } else {
      System.out.println("problem9_floor passed");
    }

    double a3 = 2.0;
    int expected3 = 2;
    int actual3 = quiz1.problem9_floor(a3);
    if (actual3 != expected3) {
      System.out.println("problem9_floor failed");
      System.out.println("expected: " + expected3);
      System.out.println("actual: " + actual3);
    } else {
      System.out.println("problem9_floor passed");
    }
  }

  static void test_problem10() {
    double a1 = 1.0;
    int expected1 = 1;
    int actual1 = quiz1.problem10_round(a1);
    if (actual1 != expected1) {
      System.out.println("problem10_round failed");
      System.out.println("expected: " + expected1);
      System.out.println("actual: " + actual1);
    } else {
      System.out.println("problem10_round passed");
    }

    double a2 = 1.4;
    int expected2 = 1;
    int actual2 = quiz1.problem10_round(a2);
    if (actual2 != expected2) {
      System.out.println("problem10_round failed");
      System.out.println("expected: " + expected2);
      System.out.println("actual: " + actual2);
    } else {
      System.out.println("problem10_round passed");
    }

    double a3 = 1.5;
    int expected3 = 2;
    int actual3 = quiz1.problem10_round(a3);
    if (actual3 != expected3) {
      System.out.println("problem10_round failed");
      System.out.println("expected: " + expected3);
      System.out.println("actual: " + actual3);
    } else {
      System.out.println("problem10_round passed");
    }
  }
}
