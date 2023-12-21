package part2;
import java.util.ArrayList;

public class quizalex {
  public static void main(String[] args) {
    int[] numbers = {1, 2, 3, 4, 5};
    
    int[] afterNumbers = square(numbers);

    int[] shouldBe = {1, 4, 9, 16, 25};


    if (java.util.Arrays.equals(afterNumbers, shouldBe)) {
      System.out.println("correct!");
    } else {
      System.out.println("incorrect!");
    }
  }

  static int[] square(int[] numbers) {
    // Given a list of numbers, loop over all elements and square each element.

    // only change inside of this method
    //from here
    int a = 0;
    while (a < numbers.length) {
      int sq = ((numbers[a] * numbers[a]));
      numbers[a] = sq;
      a = a + 1;
    }

    return numbers; // remove this line after done
    // to here
  }
}



//A while loop reads integers from input. Write an expression that executes the while loop until a negative integer 
//is read from input.

import java.util.Scanner;

public class InputReader {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int userIn;
   
      userIn = scnr.nextInt();
   
      while (/* Your code goes here */) {
         System.out.println("Integer is " + userIn);
         userIn = scnr.nextInt();
      }
   
      System.out.println("Exit"); 
   }
}




