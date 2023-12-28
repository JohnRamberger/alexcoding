package chapter2.finalquiz;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * TODO: Complete ArrayList.java so that it passes all tests below.
 * For more details, see ArrayList.java.
 * 
 * TODO: Complete LinkedList.java so that it passes all tests below.
 * For more details, see LinkedList.java.
 * 
 * The following do not exist yet:
//  * TODO: Complete Stack.java so that it passes all tests below.
//  * For more details, see Stack.java.
//  * 
//  * TODO: Complete Queue.java so that it passes all tests below.
//  * For more details, see Queue.java.
//  * 
//  * TODO: Complete BinarySearchTree.java so that it passes all tests below.
//  * For more details, see BinarySearchTree.java.
 * 
 * Run the main method below to test your code.
 * Feel free to comment out some tests if you want to test one data structure at a time.
 */

public class quiz extends Tester {
  public static void main(String[] args) {
    ArrayListTests.run();
    LinkedListTests.run();
  }
}

class ArrayListTests extends Tester {
  static int failed = 0;
  static int passed = 0;

  /*
   * Run all tests, return the number of tests that failed.
   * @return the number of tests that failed
   */
  static void run() {
    print("------------ ArrayList Tests ------------");
    testAdd();
    testAddAtIndex();
    testRemove();
    testSize();
    testIsEmpty();
    testContains();
    testIndexOf();
    testLastIndexOf();
    testClear();
    testGet();
    testSet();
    testGenerics();
    testResize();
    print("Summary: " + passed + "/" + (failed + passed) + " tests passed.");
    if (failed == 0) {
      print("All tests passed! Show your code to John to make sure it is optimized and correct.");
    }
    print("------------ ArrayList Tests ------------");
  }

  static void testAdd() {
    try {
      String message = "ArrayList.testAdd failed";
      ArrayList<Integer> list = new ArrayList<Integer>();
      list.add(1);
      verify(list.get(0) == 1, message);

      list.add(2);
      verify(list.get(0) == 1, message);
      verify(list.get(1) == 2, message);

      list.add(3);
      verify(list.get(0) == 1, message);
      verify(list.get(1) == 2, message);
      verify(list.get(2) == 3, message);

      print("ArrayList.testAdd passed");
      passed++;
    } catch(Exception e) {
      print(e.getMessage());
      failed++;
    }
  }

  static void testAddAtIndex() {
    try {
      String message = "ArrayList.testAddAtIndex failed";
      ArrayList<Integer> list = new ArrayList<Integer>();
      list.add(0, 1);
      verify(list.get(0) == 1, message);

      list.add(0, 2);
      verify(list.get(0) == 2, message);
      verify(list.get(1) == 1, message);

      list.add(1, 3);
      verify(list.get(0) == 2, message);
      verify(list.get(1) == 3, message);
      verify(list.get(2) == 1, message);

      print("ArrayList.testAddAtIndex passed");
      passed++;
    } catch(Exception e) {
      print(e.getMessage());
      failed++;
    }
  }

  static void testRemove() {
    try {
      String message = "ArrayList.testRemove failed";
      ArrayList<Integer> list = new ArrayList<Integer>();
      list.add(1);
      list.add(2);
      list.add(3);
      list.remove(1);
      verify(list.get(0) == 1, message);
      verify(list.get(1) == 3, message);

      list.remove(0);
      verify(list.get(0) == 3, message);

      print("ArrayList.testRemove passed");
      passed++;
    } catch(Exception e) {
      print(e.getMessage());
      failed++;
    }
  }

  static void testSize() {
    try {
      String message = "ArrayList.testSize failed";
      ArrayList<Integer> list = new ArrayList<Integer>();
      verify(list.size() == 0, message);

      list.add(1);
      verify(list.size() == 1, message);

      list.add(2);
      verify(list.size() == 2, message);

      list.add(3);
      verify(list.size() == 3, message);

      list.remove(1);
      verify(list.size() == 2, message);

      list.remove(0);
      verify(list.size() == 1, message);

      list.remove(0);
      verify(list.size() == 0, message);

      print("ArrayList.testSize passed");
      passed++;
    } catch(Exception e) {
      print(e.getMessage());
      failed++;
    }
  }

  static void testIsEmpty() {
    try {
      String message = "ArrayList.testIsEmpty failed";
      ArrayList<Integer> list = new ArrayList<Integer>();
      verify(list.isEmpty(), message);

      list.add(1);
      verify(!list.isEmpty(), message);

      list.add(2);
      verify(!list.isEmpty(), message);

      list.add(3);
      verify(!list.isEmpty(), message);

      list.remove(1);
      verify(!list.isEmpty(), message);

      list.remove(0);
      verify(!list.isEmpty(), message);

      list.remove(0);
      verify(list.isEmpty(), message);

      print("ArrayList.testIsEmpty passed");
      passed++;
    } catch(Exception e) {
      print(e.getMessage());
      failed++;
    }
  }

  static void testContains() {
    try {
      String message = "ArrayList.testContains failed";
      ArrayList<Integer> list = new ArrayList<Integer>();
      verify(!list.contains(1), message);

      list.add(1);
      verify(list.contains(1), message);

      list.add(2);
      verify(list.contains(1), message);
      verify(list.contains(2), message);

      list.add(3);
      verify(list.contains(1), message);
      verify(list.contains(2), message);
      verify(list.contains(3), message);

      list.remove(1);
      verify(!list.contains(2), message);

      list.remove(0);
      verify(!list.contains(1), message);

      list.remove(0);
      verify(!list.contains(3), message);

      print("ArrayList.testContains passed");
      passed++;
    } catch(Exception e) {
      print(e.getMessage());
      failed++;
    }
  }

  static void testIndexOf() {
    try {
      String message = "ArrayList.testIndexOf failed";
      ArrayList<Integer> list = new ArrayList<Integer>();
      verify(list.indexOf(1) == -1, message);

      list.add(1);
      verify(list.indexOf(1) == 0, message);

      list.add(2);
      list.add(2);
      verify(list.indexOf(1) == 0, message);
      verify(list.indexOf(2) == 1, message);

      list.add(3);
      verify(list.indexOf(1) == 0, message);
      verify(list.indexOf(2) == 1, message);
      verify(list.indexOf(3) == 3, message);

      list.remove(1);
      verify(list.indexOf(2) == 1, message);

      print("ArrayList.testIndexOf passed");
      passed++;
    } catch(Exception e) {
      print(e.getMessage());
      failed++;
    }
  }

  static void testLastIndexOf() {
    try {
      String message = "ArrayList.testLastIndexOf failed";
      ArrayList<Integer> list = new ArrayList<Integer>();
      verify(list.lastIndexOf(1) == -1, message);

      list.add(1);
      verify(list.lastIndexOf(1) == 0, message);

      list.add(2);
      list.add(2);
      verify(list.lastIndexOf(1) == 0, message);
      verify(list.lastIndexOf(2) == 2, message);

      list.add(3);
      verify(list.lastIndexOf(1) == 0, message);
      verify(list.lastIndexOf(2) == 2, message);
      verify(list.lastIndexOf(3) == 3, message);

      list.remove(1);
      verify(list.lastIndexOf(2) == 1, message);

      print("ArrayList.testLastIndexOf passed");
      passed++;
    } catch(Exception e) {
      print(e.getMessage());
      failed++;
    }
  }

  static void testClear() {
    try {
      String message = "ArrayList.testClear failed";
      ArrayList<Integer> list = new ArrayList<Integer>();
      list.add(1);
      list.add(2);
      list.add(3);
      list.clear();
      verify(list.size() == 0, message);
      verify(list.isEmpty(), message);

      print("ArrayList.testClear passed");
      passed++;
    } catch(Exception e) {
      print(e.getMessage());
      failed++;
    }
  }

  static void testGet() {
    try {
      String message = "ArrayList.testGet failed";
      ArrayList<Integer> list = new ArrayList<Integer>();
      list.add(1);
      list.add(2);
      list.add(3);
      verify(list.get(0) == 1, message);
      verify(list.get(1) == 2, message);
      verify(list.get(2) == 3, message);

      print("ArrayList.testGet passed");
      passed++;
    } catch(Exception e) {
      print(e.getMessage());
      failed++;
    }
  }

  static void testSet() {
    try {
      String message = "ArrayList.testSet failed";
      ArrayList<Integer> list = new ArrayList<Integer>();
      list.add(1);
      list.add(2);
      list.add(3);
      list.set(0, 4);
      verify(list.get(0) == 4, message);
      verify(list.get(1) == 2, message);
      verify(list.get(2) == 3, message);

      list.set(1, 5);
      verify(list.get(0) == 4, message);
      verify(list.get(1) == 5, message);
      verify(list.get(2) == 3, message);

      list.set(2, 6);
      verify(list.get(0) == 4, message);
      verify(list.get(1) == 5, message);
      verify(list.get(2) == 6, message);

      print("ArrayList.testSet passed");
      passed++;
    } catch(Exception e) {
      print(e.getMessage());
      failed++;
    }
  }

  static void testGenerics() {
    try {
      String message = "ArrayList.testGenerics failed";
      ArrayList<Integer> list = new ArrayList<Integer>();
      list.add(1);
      list.add(2);
      list.add(3);
      verify(list.get(0) == 1, message);
      verify(list.get(1) == 2, message);
      verify(list.get(2) == 3, message);

      ArrayList<String> list2 = new ArrayList<String>();
      list2.add("a");
      list2.add("b");
      list2.add("c");
      verify(list2.get(0).equals("a"), message);
      verify(list2.get(1).equals("b"), message);
      verify(list2.get(2).equals("c"), message);

      ArrayList<Boolean> list3 = new ArrayList<Boolean>();
      list3.add(true);
      list3.add(false);
      list3.add(true);
      verify(list3.get(0) == true, message);
      verify(list3.get(1) == false, message);
      verify(list3.get(2) == true, message);

      print("ArrayList.testGenerics passed");
      passed++;
    } catch(Exception e) {
      print(e.getMessage());
      failed++;
    }
  }

  static void testResize() {
    try {
      String message = "ArrayList.testResize failed";
      ArrayList<Integer> list = new ArrayList<Integer>();
      for (int i = 0; i < 10000; i++) {
        list.add(i);
      }
      for (int i = 0; i < 10000; i++) {
        verify(list.get(i) == i, message);
      }

      print("ArrayList.testResize passed");
      passed++;
    } catch(Exception e) {
      print(e.getMessage());
      failed++;
    }
  }
}

class LinkedListTests extends Tester {
  static int failed = 0;
  static int passed = 0;

  static void run() {
    print("------------ LinkedList Tests ------------");
    testAdd();
    testAddAtIndex();
    testRemove();
    testSize();
    testIsEmpty();
    testContains();
    testIndexOf();
    testLastIndexOf();
    testClear();
    testGet();
    testSet();
    testGenerics();
    testResize();
    print("Summary: " + passed + "/" + (failed + passed) + " tests passed.");
    if (failed == 0) {
      print("All tests passed! Show your code to John to make sure it is optimized and correct.");
    }
    print("------------ LinkedList Tests ------------");
  }

  static void testAdd() {
    try {
      String message = "LinkedList.testAdd failed";
      LinkedList<Integer> list = new LinkedList<Integer>();
      list.add(1);
      verify(list.get(0) == 1, message);

      list.add(2);
      verify(list.get(0) == 1, message);
      verify(list.get(1) == 2, message);

      list.add(3);
      verify(list.get(0) == 1, message);
      verify(list.get(1) == 2, message);
      verify(list.get(2) == 3, message);

      print("LinkedList.testAdd passed");
      passed++;
    } catch(Exception e) {
      print(e.getMessage());
      failed++;
    }
  }

  static void testAddAtIndex() {
    try {
      String message = "LinkedList.testAddAtIndex failed";
      LinkedList<Integer> list = new LinkedList<Integer>();
      list.add(0, 1);
      verify(list.get(0) == 1, message);

      list.add(0, 2);
      verify(list.get(0) == 2, message);
      verify(list.get(1) == 1, message);

      list.add(1, 3);
      verify(list.get(0) == 2, message);
      verify(list.get(1) == 3, message);
      verify(list.get(2) == 1, message);

      print("LinkedList.testAddAtIndex passed");
      passed++;
    } catch(Exception e) {
      print(e.getMessage());
      failed++;
    }
  }

  static void testRemove() {
    try {
      String message = "LinkedList.testRemove failed";
      LinkedList<Integer> list = new LinkedList<Integer>();
      list.add(1);
      list.add(2);
      list.add(3);
      list.remove(1);
      verify(list.get(0) == 1, message);
      verify(list.get(1) == 3, message);

      list.remove(0);
      verify(list.get(0) == 3, message);

      print("LinkedList.testRemove passed");
      passed++;
    } catch(Exception e) {
      print(e.getMessage());
      failed++;
    }
  }

  static void testSize() {
    try {
      String message = "LinkedList.testSize failed";
      LinkedList<Integer> list = new LinkedList<Integer>();
      verify(list.size() == 0, message);

      list.add(1);
      verify(list.size() == 1, message);

      list.add(2);
      verify(list.size() == 2, message);

      list.add(3);
      verify(list.size() == 3, message);

      list.remove(1);
      verify(list.size() == 2, message);

      list.remove(0);
      verify(list.size() == 1, message);

      list.remove(0);
      verify(list.size() == 0, message);

      print("LinkedList.testSize passed");
      passed++;
    } catch(Exception e) {
      print(e.getMessage());
      failed++;
    }
  }

  static void testIsEmpty() {
    try {
      String message = "LinkedList.testIsEmpty failed";
      LinkedList<Integer> list = new LinkedList<Integer>();
      verify(list.isEmpty(), message);

      list.add(1);
      verify(!list.isEmpty(), message);

      list.add(2);
      verify(!list.isEmpty(), message);

      list.add(3);
      verify(!list.isEmpty(), message);

      list.remove(1);
      verify(!list.isEmpty(), message);

      list.remove(0);
      verify(!list.isEmpty(), message);

      list.remove(0);
      verify(list.isEmpty(), message);

      print("LinkedList.testIsEmpty passed");
      passed++;
    } catch(Exception e) {
      print(e.getMessage());
      failed++;
    }
  }

  static void testContains() {
    try {
      String message = "LinkedList.testContains failed";
      LinkedList<Integer> list = new LinkedList<Integer>();
      verify(!list.contains(1), message);

      list.add(1);
      verify(list.contains(1), message);

      list.add(2);
      verify(list.contains(1), message);
      verify(list.contains(2), message);

      list.add(3);
      verify(list.contains(1), message);
      verify(list.contains(2), message);
      verify(list.contains(3), message);

      list.remove(1);
      verify(!list.contains(2), message);

      list.remove(0);
      verify(!list.contains(1), message);

      list.remove(0);
      verify(!list.contains(3), message);

      print("LinkedList.testContains passed");
      passed++;
    } catch(Exception e) {
      print(e.getMessage());
      failed++;
    }
  }

  static void testIndexOf() {
    try {
      String message = "LinkedList.testIndexOf failed";
      LinkedList<Integer> list = new LinkedList<Integer>();
      verify(list.indexOf(1) == -1, message);

      list.add(1);
      verify(list.indexOf(1) == 0, message);

      list.add(2);
      list.add(2);
      verify(list.indexOf(1) == 0, message);
      verify(list.indexOf(2) == 1, message);

      list.add(3);
      verify(list.indexOf(1) == 0, message);
      verify(list.indexOf(2) == 1, message);
      verify(list.indexOf(3) == 3, message);

      list.remove(1);
      verify(list.indexOf(2) == 1, message);

      print("LinkedList.testIndexOf passed");
      passed++;
    } catch(Exception e) {
      print(e.getMessage());
      failed++;
    }
  }

  static void testLastIndexOf() {
    try {
      String message = "LinkedList.testLastIndexOf failed";
      LinkedList<Integer> list = new LinkedList<Integer>();
      verify(list.lastIndexOf(1) == -1, message);

      list.add(1);
      verify(list.lastIndexOf(1) == 0, message);

      list.add(2);
      list.add(2);
      verify(list.lastIndexOf(1) == 0, message);
      verify(list.lastIndexOf(2) == 2, message);

      list.add(3);
      verify(list.lastIndexOf(1) == 0, message);
      verify(list.lastIndexOf(2) == 2, message);
      verify(list.lastIndexOf(3) == 3, message);

      list.remove(1);
      verify(list.lastIndexOf(2) == 1, message);

      print("LinkedList.testLastIndexOf passed");
      passed++;
    } catch(Exception e) {
      print(e.getMessage());
      failed++;
    }
  }

  static void testClear() {
    try {
      String message = "LinkedList.testClear failed";
      LinkedList<Integer> list = new LinkedList<Integer>();
      list.add(1);
      list.add(2);
      list.add(3);
      list.clear();
      verify(list.size() == 0, message);
      verify(list.isEmpty(), message);

      print("LinkedList.testClear passed");
      passed++;
    } catch(Exception e) {
      print(e.getMessage());
      failed++;
    }
  }

  static void testGet() {
    try {
      String message = "LinkedList.testGet failed";
      LinkedList<Integer> list = new LinkedList<Integer>();
      list.add(1);
      list.add(2);
      list.add(3);
      verify(list.get(0) == 1, message);
      verify(list.get(1) == 2, message);
      verify(list.get(2) == 3, message);

      print("LinkedList.testGet passed");
      passed++;
    } catch(Exception e) {
      print(e.getMessage());
      failed++;
    }
  }

  static void testSet() {
    try {
      String message = "LinkedList.testSet failed";
      LinkedList<Integer> list = new LinkedList<Integer>();
      list.add(1);
      list.add(2);
      list.add(3);
      list.set(0, 4);
      verify(list.get(0) == 4, message);
      verify(list.get(1) == 2, message);
      verify(list.get(2) == 3, message);

      list.set(1, 5);
      verify(list.get(0) == 4, message);
      verify(list.get(1) == 5, message);
      verify(list.get(2) == 3, message);

      list.set(2, 6);
      verify(list.get(0) == 4, message);
      verify(list.get(1) == 5, message);
      verify(list.get(2) == 6, message);

      print("LinkedList.testSet passed");
      passed++;
    } catch(Exception e) {
      print(e.getMessage());
      failed++;
    }
  }

  static void testGenerics() {
    try {
      String message = "LinkedList.testGenerics failed";
      LinkedList<Integer> list = new LinkedList<Integer>();
      list.add(1);
      list.add(2);
      list.add(3);
      verify(list.get(0) == 1, message);
      verify(list.get(1) == 2, message);
      verify(list.get(2) == 3, message);

      LinkedList<String> list2 = new LinkedList<String>();
      list2.add("a");
      list2.add("b");
      list2.add("c");
      verify(list2.get(0).equals("a"), message);
      verify(list2.get(1).equals("b"), message);
      verify(list2.get(2).equals("c"), message);

      LinkedList<Boolean> list3 = new LinkedList<Boolean>();
      list3.add(true);
      list3.add(false);
      list3.add(true);
      verify(list3.get(0) == true, message);
      verify(list3.get(1) == false, message);
      verify(list3.get(2) == true, message);

      print("LinkedList.testGenerics passed");
      passed++;
    } catch(Exception e) {
      print(e.getMessage());
      failed++;
    }
  }

  static void testResize() {
    try {
      String message = "LinkedList.testResize failed";
      LinkedList<Integer> list = new LinkedList<Integer>();
      for (int i = 0; i < 10000; i++) {
        list.add(i);
      }
      for (int i = 0; i < 10000; i++) {
        verify(list.get(i) == i, message);
      }

      print("LinkedList.testResize passed");
      passed++;
    } catch(Exception e) {
      print(e.getMessage());
      failed++;
    }
  }
}


abstract class Tester {
  static void verify(boolean b) {
    if (!b) {
      throw new RuntimeException("Test failed");
    }
  }

  static void verify(boolean b, String message) {
    if (!b) {
      throw new RuntimeException(message);
    }
  }

  static void print(String message) {
    System.out.println(message);
  }
}
