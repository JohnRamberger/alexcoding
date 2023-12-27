package chapter2.part2;

public class a {
  public static void main(String[] args) {
    System.out.println(US.a);
    
    US.a = 20;
    System.out.println(country.a);
  }
}

class country {
  static int a = 10;
  protected int hello = 5;
}

class US extends country {
  void abc () {
    hello = 5;
  }
}
