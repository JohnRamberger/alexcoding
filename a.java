class a {
  public static void main(String[] args) {
    String b = "apple orange tomato";
    // String[] c = b.split(" ");

    // String d = String.join("", c);
    // print(java.util.Arrays.toString(c));


    String d = b.replaceAll(" ", "");

    print(d);
  }
  static void print(String s) {
    System.out.println(s);
  }
}