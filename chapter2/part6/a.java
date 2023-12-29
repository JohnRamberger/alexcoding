package chapter2.part6;

import java.util.ArrayList;

// GENERICS and enums

enum boolean1 {
  tru,
  fals,
  maybe
}

enum Color {
  Red,
  Green,
  Blue,
  Yellow
}

public class a {
  public static void main(String[] args) {
    AL<Integer> list = new AL<>();

    list.add(90);
    System.out.println(list.get(0));
  }
}
// defined type with specific options you can choose from, drop down menu when selecting state
// cannot use true and false bc those are reserved variables

class AL<T> {
  ArrayList<T> arr = new ArrayList<>();

  T get(int index) {
    return arr.get(index);
  }

  void add(T value) {
    arr.add(value);
  }
}