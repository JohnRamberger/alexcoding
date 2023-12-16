package part2;

import java.util.ArrayList;

public class lists {
  public static void main(String[] args) {
    // type name = value
    int[] oddnumbers = {1, 3, 5, 7, 9};
    // //[] makes our primitive thing into a list
    // String[] names = {"Alex", "Bob", "Charlie", "Diana", "Ethan"};
    // boolean[] bools = {true, false, true, false, true};
// to access the value from a list you do another [] and you give an index such as 1, this means that we want the first index value fo the list INDEXES START AT 0
    // System.out.println(oddnumbers[0]);

    // int i = oddnumbers.length - 1;
    // while(i >= 0) {
    //   System.out.println(oddnumbers[i]);
    //   i = i -1;
    // }
    

    // for (int i = oddnumbers.length - 1; i >= 0; i = i - 1) {
    //   System.out.println(oddnumbers[i]);
    // }

    // boolean found = false;
    // while (found == false) {
    //   // do something
    //   if (true) {
    //     found = true;
    //   }
    // }

    // int[] numbers = new int[5]; //want to keep the data from this

    // numbers[0] = 1;

    // int[] temporaryList = new int[6]; //new list

    // for (int i = 0; i < numbers.length; i = i + 1) {
    //   temporaryList[i] = numbers[i];
    // }

    // numbers = temporaryList; // overwriting since we now have temporarylist with prev info and extra space
  
    // System.out.println(numbers[0]);

    // int[] numbers = new int[5];
    // ArrayList<Boolean> numbers = new ArrayList<Boolean>();
    // System.out.println(numbers);
    // numbers.add(true);

    // System.out.println(numbers);

  }
}
// .length is an ATTRIBUTE = a property of the list, length is how many elements are in the list, in the above example the length is 5 
// while loop, similar to if statement where there is the condition that will continue running while the condition is true
// High Level - Low Level
// High level = easy to read, easy to write, easy to understand: java
// Low level = hard to read, hard to write, hard to understand: 


// == when comparing to quality
// = is when we are setting a value


// if you are comparing 2 strings for quality you CANNOT connect strings wiht double equals, in order to compare strings you need to do .equals