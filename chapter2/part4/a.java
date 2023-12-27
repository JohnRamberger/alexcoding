package chapter2.part4;

import java.util.Random;

public class a {
  public static void main(String[] args) {

  }

  static int stringbean(int[] array, int target) {
    Random rand = new Random();
    int r = rand.nextInt(10);
    if (r == 5) {
      return 10;
    }
    System.out.println("hello");
    return stringbean(array, target);
  }
}
