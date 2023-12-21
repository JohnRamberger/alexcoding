package chapter2.part1;

public class a {
  public static void main(String[] args) {
    // String name = "alex";
    // double height = 5.11;
    // String eyecolor = "brown"; 

    Person alex = new Person("alex", 5.11, "brown", 20);
    Person john = new Person("john", 6.4, "blue", 21); // equals null
    
    System.out.println(alex);
    // alex.blink();
    // alex.birthday();
    // System.out.println(alex);


    System.out.println(john);
  }
}
// a class is a new type essentially, you can think of it as an object that replaces an int string etc.
// object = something that holds multiple things (variables)

// every object can have state and behavior
// state = variables 
class Person {
  String name; // state 
  double height; // state 
  String eyecolor; // state 
  int age;
  // constructor
  public Person(String name1, double height1, String eyecolor1, int age1) {
    name = "name1";
    height = height1;
    eyecolor = eyecolor1;
    age = age1;
  }

  public void blink() { // behavior
    System.out.println("*alex blinks*");
  }

  public void birthday() {
    age = age + 1;
  }
}

