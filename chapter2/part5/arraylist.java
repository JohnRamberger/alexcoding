package chapter2.part5;

import java.util.ArrayList;
import java.util.Collection;

public class arraylist {
  public static void main(String[] args) {
    // int[] array = new int[6]; // _ _ _ _ _ _

    ArrayList<Integer> arrayList2 = new ArrayList<Integer>();
    arrayList2.add(13);
    arrayList2.add(13);
    arrayList2.add(13);

    ArrayList<Integer> arrayList = new ArrayList<Integer>();
    print(arrayList.toString());
    arrayList.add(1);
    arrayList.add(2);
    arrayList.add(3);
    arrayList.add(4);
    arrayList.add(5);
    print(arrayList.toString());
    arrayList.remove(1);
    print(arrayList.toString());
    
    arrayList.add(1, 7);
    print(arrayList.toString());
    
    arrayList.addAll(arrayList2);
    print(arrayList.toString());

    print(arrayList.equals(arrayList2));

    // array[3]
    arrayList.get(3);
    // array [3] = 6
    arrayList.set(3, 6);
  }

  static void print(String s) {
    System.out.println(s);
  }

  static void print(Boolean s) {
    System.out.println(s);
  }
}