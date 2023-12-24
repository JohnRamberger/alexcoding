/**
 * HELPFUL INFORMATION
 * 
 * 1. VISIBILITY modifiers
 * - public: visible to all classes
 * - private: visible only to the class that defines it
 * - protected: visible to the class that defines it and any subclasses
 * - default (none of the others used): visible to the class that defines it and any classes in the same package
 * 
 * 2. STATIC modifier
 * - static: a class variable or method that is shared among all instances of a class
 *  - can be accessed directly through the class name
 *  Ex: If I have a dog class with a static variable called "numLegs", I can access it like this:
 *     Dog.numLegs instead of Dog dog = new Dog(); dog.numLegs
 * 
 * 3. FINAL modifier
 * - final: a variable that cannot be changed
 * - final: a method that cannot be overridden
 * - final: a class that cannot be extended
 * 
 * 4. ABSTRACT modifier
 * - abstract: a method that must be implemented by any class that extends the class that defines it
 * - abstract: a class that cannot be instantiated
 * 
 * 5. INTERFACE
 * - interface: a class that defines a set of methods that must be implemented by any class that implements it
 * 
 * 6. CONSTRUCTOR
 * - constructor: a method that is called when an instance of a class is created
 * - constructor: has the same name as the class
 * - constructor: does not have a return type
 * - constructor: can be overloaded
 * 
 * 7. INHERITANCE
 * - inheritance: a class that extends another class inherits all of the methods and variables of the class it extends
 * - inheritance: a class can only extend one class
 * - inheritance: a class can implement multiple interfaces
 * 
 * 8. POLYMORPHISM
 * - polymorphism: a variable of a superclass type can refer to an instance of a subclass
 * - polymorphism: a method of a superclass can be overridden by a subclass
 * ex: Animal animal = new Dog();
 *    animal.makeNoise(); // this will call the makeNoise() method in the Dog class
 * 
 * 9. OVERRIDING
 * - overriding: a method in a subclass that has the same name and signature as a method in the superclass
 *  ex: public class Animal {
 *       public void makeNoise() {
 *        System.out.println("Animal noise");
 *      }
 *   }
 *  public class Dog extends Animal {
 *   public void makeNoise() {
 *   System.out.println("Bark");
 *  }
 * }
 * 
 * 10. OVERLOADING
 * - overloading: a method that has the same name but different parameters
 * ex: public void makeNoise() {
 *     System.out.println("Animal noise");
 *  }
 * public void makeNoise(String noise) {
 *  System.out.println(noise);
 * }
 */

// For all questions, write your answer using comments below the question.
// Send your answers to me once you are done and I can give you feedback.

// Question 1. What is the purpose of visibility modifiers? Give an example where you would use each one.

// Question 2. What is the purpose of the static modifier? Give an example where you would use it.

// Question 3. What is the purpose of the final modifier? Give an example where you would use it.

// Question 4. What is the purpose of the abstract modifier? Give an example where you would use it.

// Question 5. What is the purpose of an interface? Give an example where you would use it.

// Question 6. What is the purpose of a constructor? Give an example where you would use it.

// Question 7. What is the purpose of inheritance? Give an example where you would use it.

// Question 8. What is the purpose of polymorphism? Give an example where you would use it.

// Question 9. What is the difference between overriding and overloading? Give an example where you would use each one.

// Question 10. What is the difference between a class and an object? Give an example where you would use each one.

// Question 11. What is the difference between an abstract class and an interface? Give an example where you would use each one.

