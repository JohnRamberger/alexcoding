package fundamentals;

public class quiz1_check {
  static int failed = 0;
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
    test_problem11();
    test_problem12();
    test_problem13();
    test_problem14();
    test_problem15();
    test_problem16();
    test_problem17();
    test_problem18();
    test_problem19();
    test_problem20();
    test_problem21();
    test_problem22();
    test_problem23();
    test_problem24();
    test_problem25();
    test_problem26();
    test_problem27();
    test_problem28();
    test_problem29();
    test_problem30();
    test_problem31();
    test_problem32();
    test_problem33();
    test_problem34();

    if (failed == 0) {
      System.out.println("--------------------");
      System.out.println("All tests passed! :D");
      System.out.println("--------------------");
    } else {
      System.out.println("Get to work on the " + failed + " failed tests");
    }
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
      failed++;
    } else {
      System.out.println("problem1_sum passed");
    }

    int a2 = 7;
    int b2 = 3;
    int expected2 = 10;
    int actual2 = quiz1.problem1_sum(a2, b2);
    if (actual2 != expected2) {
      System.out.println("problem1_sum failed");
      System.out.println("expected: " + expected2);
      System.out.println("actual: " + actual2);
      failed++;
    } else {
      System.out.println("problem1_sum passed");
    }
  }

  static void test_problem2() {
    int a1 = 2;
    int expected1 = 4;
    int actual1 = quiz1.problem2_square(a1);
    if (actual1 != expected1) {
      System.out.println("problem2_square failed");
      System.out.println("expected: " + expected1);
      System.out.println("actual: " + actual1);
      failed++;
    } else {
      System.out.println("problem2_square passed");
    }

    int a2 = 4;
    int expected2 = 16;
    int actual2 = quiz1.problem2_square(a2);
    if (actual2 != expected2) {
      System.out.println("problem2_square failed");
      System.out.println("expected: " + expected2);
      System.out.println("actual: " + actual2);
      failed++;
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
      failed++;
    } else {
      System.out.println("problem3_division passed");
    }

    int numerator2 = 7;
    int denominator2 = 2;
    double expected2 = 3.5;
    double actual2 = quiz1.problem3_division(numerator2, denominator2);
    if (actual2 != expected2) {
      System.out.println("problem3_division failed");
      System.out.println("expected: " + expected2);
      System.out.println("actual: " + actual2);
      failed++;
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
      failed++;
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
      failed++;
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
      failed++;
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
      failed++;
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
      failed++;
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
      failed++;
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
      failed++;
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
      failed++;
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
      failed++;
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
      failed++;
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
      failed++;
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
      failed++;
    } else {
      System.out.println("problem8_atleast2 passed");
    }

    boolean a4 = false;
    boolean b4 = false;
    boolean c4 = true;
    boolean expected4 = false;
    boolean actual4 = quiz1.problem8_atleast2(a4, b4, c4);
    if (actual4 != expected4) {
      System.out.println("problem8_atleast2 failed");
      System.out.println("expected: " + expected4);
      System.out.println("actual: " + actual4);
      failed++;
    } else {
      System.out.println("problem8_atleast2 passed");
    }

    boolean a5 = false;
    boolean b5 = false;
    boolean c5 = false;
    boolean expected5 = false;
    boolean actual5 = quiz1.problem8_atleast2(a5, b5, c5);
    if (actual5 != expected5) {
      System.out.println("problem8_atleast2 failed");
      System.out.println("expected: " + expected5);
      System.out.println("actual: " + actual5);
      failed++;
    } else {
      System.out.println("problem8_atleast2 passed");
    }
  }

  static void test_problem9() {
    double a1 = 1.5;
    int expected1 = 1;
    int actual1 = quiz1.problem9_floor(a1);
    if (actual1 != expected1) {
      System.out.println("problem9_floor failed");
      System.out.println("expected: " + expected1);
      System.out.println("actual: " + actual1);
      failed++;
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
      failed++;
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
      failed++;
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
      failed++;
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
      failed++;
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
      failed++;
    } else {
      System.out.println("problem10_round passed");
    }
  }

  static void test_problem11() {
    String a1 = "abc";
    String expected1 = "xXabcXx";
    String actual1 = quiz1.problem11_xXXx(a1);
    if (!actual1.equals(expected1)) {
      System.out.println("problem11_xXXx failed");
      System.out.println("expected: " + expected1);
      System.out.println("actual: " + actual1);
      failed++;
    } else {
      System.out.println("problem11_xXXx passed");
    }

    String a2 = "xXx";
    String expected2 = "xXxXxXx";
    String actual2 = quiz1.problem11_xXXx(a2);
    if (!actual2.equals(expected2)) {
      System.out.println("problem11_xXXx failed");
      System.out.println("expected: " + expected2);
      System.out.println("actual: " + actual2);
      failed++;
    } else {
      System.out.println("problem11_xXXx passed");
    }
  }

  static void test_problem12() {
    String a1 = "abc";
    String b1 = "def";
    String expected1 = "abcdef";
    String actual1 = quiz1.problem12_concatenate(a1, b1);
    if (!actual1.equals(expected1)) {
      System.out.println("problem12_concatenate failed");
      System.out.println("expected: " + expected1);
      System.out.println("actual: " + actual1);
      failed++;
    } else {
      System.out.println("problem12_concatenate passed");
    }

    String a2 = "asd1";
    String b2 = "asd2";
    String expected2 = "asd1asd2";
    String actual2 = quiz1.problem12_concatenate(a2, b2);
    if (!actual2.equals(expected2)) {
      System.out.println("problem12_concatenate failed");
      System.out.println("expected: " + expected2);
      System.out.println("actual: " + actual2);
      failed++;
    } else {
      System.out.println("problem12_concatenate passed");
    }
  }

  static void test_problem13() {
    String a1 = "abc";
    int expected1 = 3;
    int actual1 = quiz1.problem13_length(a1);
    if (actual1 != expected1) {
      System.out.println("problem13_length failed");
      System.out.println("expected: " + expected1);
      System.out.println("actual: " + actual1);
      failed++;
    } else {
      System.out.println("problem13_length passed");
    }

    String a2 = "hello";
    int expected2 = 5;
    int actual2 = quiz1.problem13_length(a2);
    if (actual2 != expected2) {
      System.out.println("problem13_length failed");
      System.out.println("expected: " + expected2);
      System.out.println("actual: " + actual2);
      failed++;
    } else {
      System.out.println("problem13_length passed");
    }
  }

  static void test_problem14() {
    String a1 = "abc";
    String b1 = "defg";
    String expected1 = b1;
    String actual1 = quiz1.problem14_longer(a1, b1);
    if (!actual1.equals(expected1)) {
      System.out.println("problem14_longer failed");
      System.out.println("expected: " + expected1);
      System.out.println("actual: " + actual1);
      failed++;
    } else {
      System.out.println("problem14_longer passed");
    }

    String a2 = "abcaskjdkl";
    String b2 = "defg";
    String expected2 = a2;
    String actual2 = quiz1.problem14_longer(a2, b2);
    if (!actual2.equals(expected2)) {
      System.out.println("problem14_longer failed");
      System.out.println("expected: " + expected2);
      System.out.println("actual: " + actual2);
      failed++;
    } else {
      System.out.println("problem14_longer passed");
    }
  }

  static void test_problem15() {
    String a1 = "abc";
    String expected1 = "bc";
    String actual1 = quiz1.problem15_firstremoved(a1);
    if (!actual1.equals(expected1)) {
      System.out.println("problem15_firstremoved failed");
      System.out.println("expected: " + expected1);
      System.out.println("actual: " + actual1);
      failed++;
    } else {
      System.out.println("problem15_firstremoved passed");
    }

    String a2 = "hello";
    String expected2 = "ello";
    String actual2 = quiz1.problem15_firstremoved(a2);
    if (!actual2.equals(expected2)) {
      System.out.println("problem15_firstremoved failed");
      System.out.println("expected: " + expected2);
      System.out.println("actual: " + actual2);
      failed++;
    } else {
      System.out.println("problem15_firstremoved passed");
    }
  }

  static void test_problem16() {
    String a1 = "abc";
    String expected1 = "ab";
    String actual1 = quiz1.problem16_lastremoved(a1);
    if (!actual1.equals(expected1)) {
      System.out.println("problem16_lastremoved failed");
      System.out.println("expected: " + expected1);
      System.out.println("actual: " + actual1);
      failed++;
    } else {
      System.out.println("problem16_lastremoved passed");
    }

    String a2 = "hello";
    String expected2 = "hell";
    String actual2 = quiz1.problem16_lastremoved(a2);
    if (!actual2.equals(expected2)) {
      System.out.println("problem16_lastremoved failed");
      System.out.println("expected: " + expected2);
      System.out.println("actual: " + actual2);
      failed++;
    } else {
      System.out.println("problem16_lastremoved passed");
    }
  }

  static void test_problem17() {
    String a1 = "abc";
    String expected1 = "b";
    String actual1 = quiz1.problem17_firstlastremoved(a1);
    if (!actual1.equals(expected1)) {
      System.out.println("problem17_firstlastremoved failed");
      System.out.println("expected: " + expected1);
      System.out.println("actual: " + actual1);
      failed++;
    } else {
      System.out.println("problem17_firstlastremoved passed");
    }

    String a2 = "hello";
    String expected2 = "ell";
    String actual2 = quiz1.problem17_firstlastremoved(a2);
    if (!actual2.equals(expected2)) {
      System.out.println("problem17_firstlastremoved failed");
      System.out.println("expected: " + expected2);
      System.out.println("actual: " + actual2);
      failed++;
    } else {
      System.out.println("problem17_firstlastremoved passed");
    }
  }

  static void test_problem18() {
    String a1 = "abc";
    String expected1 = "cba";
    String actual1 = quiz1.problem18_swapped(a1);
    if (!actual1.equals(expected1)) {
      System.out.println("problem18_swapped failed");
      System.out.println("expected: " + expected1);
      System.out.println("actual: " + actual1);
      failed++;
    } else {
      System.out.println("problem18_swapped passed");
    }

    String a2 = "hello";
    String expected2 = "oellh";
    String actual2 = quiz1.problem18_swapped(a2);
    if (!actual2.equals(expected2)) {
      System.out.println("problem18_swapped failed");
      System.out.println("expected: " + expected2);
      System.out.println("actual: " + actual2);
      failed++;
    } else {
      System.out.println("problem18_swapped passed");
    }
  }

  static void test_problem19() {
    String a1 = "abc";
    String expected1 = "Abc";
    String actual1 = quiz1.problem19_capitalize(a1);
    if (!actual1.equals(expected1)) {
      System.out.println("problem19_capitalize failed");
      System.out.println("expected: " + expected1);
      System.out.println("actual: " + actual1);
      failed++;
    } else {
      System.out.println("problem19_capitalize passed");
    }

    String a2 = "hello";
    String expected2 = "Hello";
    String actual2 = quiz1.problem19_capitalize(a2);
    if (!actual2.equals(expected2)) {
      System.out.println("problem19_capitalize failed");
      System.out.println("expected: " + expected2);
      System.out.println("actual: " + actual2);
      failed++;
    } else {
      System.out.println("problem19_capitalize passed");
    }
  }

  static void test_problem20() {
    String a1 = "aBC";
    String expected1 = "Abc";
    String actual1 = quiz1.problem20_capitalize2(a1);
    if (!actual1.equals(expected1)) {
      System.out.println("problem20_capitalize2 failed");
      System.out.println("expected: " + expected1);
      System.out.println("actual: " + actual1);
      failed++;
    } else {
      System.out.println("problem20_capitalize2 passed");
    }

    String a2 = "HeLlO";
    String expected2 = "Hello";
    String actual2 = quiz1.problem20_capitalize2(a2);
    if (!actual2.equals(expected2)) {
      System.out.println("problem20_capitalize2 failed");
      System.out.println("expected: " + expected2);
      System.out.println("actual: " + actual2);
      failed++;
    } else {
      System.out.println("problem20_capitalize2 passed");
    }
  }

  static void test_problem21() {
    String a1 = "abc";
    String b1 = "def";
    String expected1 = "abc def";
    String actual1 = quiz1.problem21_joinspace(a1, b1);
    if (!actual1.equals(expected1)) {
      System.out.println("problem21_joinspace failed");
      System.out.println("expected: " + expected1);
      System.out.println("actual: " + actual1);
      failed++;
    } else {
      System.out.println("problem21_joinspace passed");
    }

    String a2 = "hello";
    String b2 = "world";
    String expected2 = "hello world";
    String actual2 = quiz1.problem21_joinspace(a2, b2);
    if (!actual2.equals(expected2)) {
      System.out.println("problem21_joinspace failed");
      System.out.println("expected: " + expected2);
      System.out.println("actual: " + actual2);
      failed++;
    } else {
      System.out.println("problem21_joinspace passed");
    }
  }

  static void test_problem22() {
    String a1 = "abc";
    String b1 = "def";
    String expected1 = "adbecf";
    String actual1 = quiz1.problem22_alternating(a1, b1);
    if (!actual1.equals(expected1)) {
      System.out.println("problem22_alternating failed");
      System.out.println("expected: " + expected1);
      System.out.println("actual: " + actual1);
      failed++;
    } else {
      System.out.println("problem22_alternating passed");
    }

    String a2 = "abcd";
    String b2 = "efgh";
    String expected2 = "aebfcgdh";
    String actual2 = quiz1.problem22_alternating(a2, b2);
    if (!actual2.equals(expected2)) {
      System.out.println("problem22_alternating failed");
      System.out.println("expected: " + expected2);
      System.out.println("actual: " + actual2);
      failed++;
    } else {
      System.out.println("problem22_alternating passed");
    }
  }

  static void test_problem23() {
    String a1 = "abc";
    String b1 = "de";
    String c1 = "g";
    int expected1 = 3;
    int actual1 = quiz1.problem23_longestlength(a1, b1, c1);
    if (actual1 != expected1) {
      System.out.println("problem23_longestlength failed");
      System.out.println("expected: " + expected1);
      System.out.println("actual: " + actual1);
      failed++;
    } else {
      System.out.println("problem23_longestlength passed");
    }

    String a2 = "abc";
    String b2 = "defgh";
    String c2 = "i";
    int expected2 = 5;
    int actual2 = quiz1.problem23_longestlength(a2, b2, c2);
    if (actual2 != expected2) {
      System.out.println("problem23_longestlength failed");
      System.out.println("expected: " + expected2);
      System.out.println("actual: " + actual2);
      failed++;
    } else {
      System.out.println("problem23_longestlength passed");
    }
  }

  static void test_problem24() {
    int[] list1 = {1, 2, 3};
    int[] expected1 = {2, 4, 6};
    int[] actual1 = quiz1.problem24_double(list1);
    if (!java.util.Arrays.equals(actual1, expected1)) {
      System.out.println("problem24_double failed");
      System.out.println("expected: " + java.util.Arrays.toString(expected1));
      System.out.println("actual: " + java.util.Arrays.toString(actual1));
      failed++;
    } else {
      System.out.println("problem24_double passed");
    }

    int[] list2 = {1, 2, 3, 4, 5};
    int[] expected2 = {2, 4, 6, 8, 10};
    int[] actual2 = quiz1.problem24_double(list2);
    if (!java.util.Arrays.equals(actual2, expected2)) {
      System.out.println("problem24_double failed");
      System.out.println("expected: " + java.util.Arrays.toString(expected2));
      System.out.println("actual: " + java.util.Arrays.toString(actual2));
      failed++;
    } else {
      System.out.println("problem24_double passed");
    }
  }

  static void test_problem25() {
    int[] list1 = {1, 2, 3};
    int expected1 = 6;
    int actual1 = quiz1.problem25_sum(list1);
    if (actual1 != expected1) {
      System.out.println("problem25_sum failed");
      System.out.println("expected: " + expected1);
      System.out.println("actual: " + actual1);
      failed++;
    } else {
      System.out.println("problem25_sum passed");
    }

    int[] list2 = {1, 2, 3, 4, 5};
    int expected2 = 15;
    int actual2 = quiz1.problem25_sum(list2);
    if (actual2 != expected2) {
      System.out.println("problem25_sum failed");
      System.out.println("expected: " + expected2);
      System.out.println("actual: " + actual2);
      failed++;
    } else {
      System.out.println("problem25_sum passed");
    }
  }

  static void test_problem26() {
    int[] list1 = {1, -2, 3, -4, 0};
    boolean[] expected1 = {true, false, true, false, false};
    boolean[] actual1 = quiz1.problem26_positive(list1);
    if (!java.util.Arrays.equals(actual1, expected1)) {
      System.out.println("problem26_positive failed");
      System.out.println("expected: " + java.util.Arrays.toString(expected1));
      System.out.println("actual: " + java.util.Arrays.toString(actual1));
      failed++;
    } else {
      System.out.println("problem26_positive passed");
    }

    int[] list2 = {-1, -2, -3, -4, -5};
    boolean[] expected2 = {false, false, false, false, false};
    boolean[] actual2 = quiz1.problem26_positive(list2);
    if (!java.util.Arrays.equals(actual2, expected2)) {
      System.out.println("problem26_positive failed");
      System.out.println("expected: " + java.util.Arrays.toString(expected2));
      System.out.println("actual: " + java.util.Arrays.toString(actual2));
      failed++;
    } else {
      System.out.println("problem26_positive passed");
    }
  }

  static void test_problem27() {
    int[] list1 = {0, 1, 2, 3, 4};
    boolean[] expected1 = {true, false, true, false, true};
    boolean[] actual1 = quiz1.problem27_even(list1);
    if (!java.util.Arrays.equals(actual1, expected1)) {
      System.out.println("problem27_even failed");
      System.out.println("expected: " + java.util.Arrays.toString(expected1));
      System.out.println("actual: " + java.util.Arrays.toString(actual1));
      failed++;
    } else {
      System.out.println("problem27_even passed");
    }

    int[] list2 = {1, 3, 5, 7, 9};
    boolean[] expected2 = {false, false, false, false, false};
    boolean[] actual2 = quiz1.problem27_even(list2);
    if (!java.util.Arrays.equals(actual2, expected2)) {
      System.out.println("problem27_even failed");
      System.out.println("expected: " + java.util.Arrays.toString(expected2));
      System.out.println("actual: " + java.util.Arrays.toString(actual2));
      failed++;
    } else {
      System.out.println("problem27_even passed");
    }
  }

  static void test_problem28() {
    double[] list1 = {1.1, 2.2, 3.3};
    int[] expected1 = {1, 2, 3};
    int[] actual1 = quiz1.problem28_floor(list1);
    if (!java.util.Arrays.equals(actual1, expected1)) {
      System.out.println("problem28_floor failed");
      System.out.println("expected: " + java.util.Arrays.toString(expected1));
      System.out.println("actual: " + java.util.Arrays.toString(actual1));
      failed++;
    } else {
      System.out.println("problem28_floor passed");
    }

    double[] list2 = {6.9, 2.9, 1.9};
    int[] expected2 = {6, 2, 1};
    int[] actual2 = quiz1.problem28_floor(list2);
    if (!java.util.Arrays.equals(actual2, expected2)) {
      System.out.println("problem28_floor failed");
      System.out.println("expected: " + java.util.Arrays.toString(expected2));
      System.out.println("actual: " + java.util.Arrays.toString(actual2));
      failed++;
    } else {
      System.out.println("problem28_floor passed");
    }
  }

  static void test_problem29() {
    boolean[] list1 = {true, false, true, false, true};
    int expected1 = 3;
    int actual1 = quiz1.problem29_counttrue(list1);
    if (actual1 != expected1) {
      System.out.println("problem29_counttrue failed");
      System.out.println("expected: " + expected1);
      System.out.println("actual: " + actual1);
      failed++;
    } else {
      System.out.println("problem29_counttrue passed");
    }

    boolean[] list2 = {false, false, false, false, false};
    int expected2 = 0;
    int actual2 = quiz1.problem29_counttrue(list2);
    if (actual2 != expected2) {
      System.out.println("problem29_counttrue failed");
      System.out.println("expected: " + expected2);
      System.out.println("actual: " + actual2);
      failed++;
    } else {
      System.out.println("problem29_counttrue passed");
    }
  }

  static void test_problem30() {
    String[] list1 = {"a", "b", "c"};
    String expected1 = "abc";
    String actual1 = quiz1.problem30_concatenate(list1);
    if (!actual1.equals(expected1)) {
      System.out.println("problem30_concatenate failed");
      System.out.println("expected: " + expected1);
      System.out.println("actual: " + actual1);
      failed++;
    } else {
      System.out.println("problem30_concatenate passed");
    }

    String[] list2 = {"a", "b", "c", "d", "e"};
    String expected2 = "abcde";
    String actual2 = quiz1.problem30_concatenate(list2);
    if (!actual2.equals(expected2)) {
      System.out.println("problem30_concatenate failed");
      System.out.println("expected: " + expected2);
      System.out.println("actual: " + actual2);
      failed++;
    } else {
      System.out.println("problem30_concatenate passed");
    }
  }

  static void test_problem31() {
    String[] list1 = {"a", "b", "c"};
    String[] expected1 = {"xXaXx", "xXbXx", "xXcXx"};
    String[] actual1 = quiz1.problem31_xXlistXx(list1);
    if (!java.util.Arrays.equals(actual1, expected1)) {
      System.out.println("problem31_xXlistXx failed");
      System.out.println("expected: " + java.util.Arrays.toString(expected1));
      System.out.println("actual: " + java.util.Arrays.toString(actual1));
      failed++;
    } else {
      System.out.println("problem31_xXlistXx passed");
    }

    String[] list2 = {"a", "b", "c", "d", "e"};
    String[] expected2 = {"xXaXx", "xXbXx", "xXcXx", "xXdXx", "xXeXx"};
    String[] actual2 = quiz1.problem31_xXlistXx(list2);
    if (!java.util.Arrays.equals(actual2, expected2)) {
      System.out.println("problem31_xXlistXx failed");
      System.out.println("expected: " + java.util.Arrays.toString(expected2));
      System.out.println("actual: " + java.util.Arrays.toString(actual2));
      failed++;
    } else {
      System.out.println("problem31_xXlistXx passed");
    }
  }

  static void test_problem32() {
    String[] list1 = {"a", "b", "c"};
    String[] expected1 = {"c", "b", "a"};
    String[] actual1 = quiz1.problem32_reverse(list1);
    if (!java.util.Arrays.equals(actual1, expected1)) {
      System.out.println("problem32_reverse failed");
      System.out.println("expected: " + java.util.Arrays.toString(expected1));
      System.out.println("actual: " + java.util.Arrays.toString(actual1));
      failed++;
    } else {
      System.out.println("problem32_reverse passed");
    }

    String[] list2 = {"a", "b", "c", "d", "e"};
    String[] expected2 = {"e", "d", "c", "b", "a"};
    String[] actual2 = quiz1.problem32_reverse(list2);
    if (!java.util.Arrays.equals(actual2, expected2)) {
      System.out.println("problem32_reverse failed");
      System.out.println("expected: " + java.util.Arrays.toString(expected2));
      System.out.println("actual: " + java.util.Arrays.toString(actual2));
      failed++;
    } else {
      System.out.println("problem32_reverse passed");
    }
  }

  static void test_problem33() {
    String[] list1 = {"a", "b", "c"};
    boolean[] list2 = {true, false, true};
    String[] expected1 = {"a", "c"};
    String[] actual1 = quiz1.problem33_filter(list1, list2);
    if (!java.util.Arrays.equals(actual1, expected1)) {
      System.out.println("problem33_filter failed");
      System.out.println("expected: " + java.util.Arrays.toString(expected1));
      System.out.println("actual: " + java.util.Arrays.toString(actual1));
      failed++;
    } else {
      System.out.println("problem33_filter passed");
    }

    String[] list3 = {"a", "b", "c", "d", "e"};
    boolean[] list4 = {true, false, true, false, true};
    String[] expected2 = {"a", "c", "e"};
    String[] actual2 = quiz1.problem33_filter(list3, list4);
    if (!java.util.Arrays.equals(actual2, expected2)) {
      System.out.println("problem33_filter failed");
      System.out.println("expected: " + java.util.Arrays.toString(expected2));
      System.out.println("actual: " + java.util.Arrays.toString(actual2));
      failed++;
    } else {
      System.out.println("problem33_filter passed");
    }
  }

  static void test_problem34() {
    int[] list1 = {1, 2, 3};
    double[] list2 = {0.1, 0.2, 0.3};
    boolean[] list3 = {true, false, true};
    double[] expected1 = {1.1, 1.8, 3.3};
    double[] actual1 = quiz1.problem34_math(list1, list2, list3);
    if (!java.util.Arrays.equals(actual1, expected1)) {
      System.out.println("problem34_math failed");
      System.out.println("expected: " + java.util.Arrays.toString(expected1));
      System.out.println("actual: " + java.util.Arrays.toString(actual1));
      failed++;
    } else {
      System.out.println("problem34_math passed");
    }

    int[] list4 = {1, 2, 3, 4, 5};
    double[] list5 = {0.1, 0.2, 0.3, 0.4, 0.5};
    boolean[] list6 = {true, false, true, false, true};
    double[] expected2 = {1.1, 1.8, 3.3, 3.6, 5.5};
    double[] actual2 = quiz1.problem34_math(list4, list5, list6);
    if (!java.util.Arrays.equals(actual2, expected2)) {
      System.out.println("problem34_math failed");
      System.out.println("expected: " + java.util.Arrays.toString(expected2));
      System.out.println("actual: " + java.util.Arrays.toString(actual2));
      failed++;
    } else {
      System.out.println("problem34_math passed");
    }
  }
}
