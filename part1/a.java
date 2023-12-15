package part1;
class a {
  public static void main(String[] args) {
    // here
    // System.out.println("Hello World!");
    // System.out.print("Hello World!");


    // VARIABLES
    // define variables
    // type name = value;
    int integer = 17;
    double decimal = 111111.1111111111111111111111;
    // char character = 'a';
    String string = "asdasdasd asd asd";
    boolean bool = true; // true or false

    // IF STATEMENTS
    // if (something is true) {
    //   then do something
    // }

    // if (integer > decimal) {
    //   System.out.println("integer is greater than decimal");
    // } else if (integer < decimal) {
    //   System.out.println("integer is less than decimal");
    // } else {
    //   System.out.println("integer is equal to decimal");
    // }


    double sum = add(integer, decimal);      //calling

    double sum2 = add(1, 2);

    System.out.println(sum);
  }

  // FUNCTIONS allows us to reuse variables and functions, also mantainability
  // type name (parameters) {
  static double add(int integer, double decimal) {      //defining a function
    double sum = integer * decimal;
    
    return sum;
  }
}
