package part2;
import java.util.ArrayList;

public class quizyoojin {
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

  static int[] square(int[] numbers) { //why does this have to return smth?
    // Given a list of numbers, loop over all elements and square each element.

int i = numbers.length - 1;

   while(i >= 0) {      //looped over all elements
     numbers[i]=numbers[i] * numbers[i];      //squared each element. Can numbers[i] be named differently?If return was diff too?
     i = i - 1;   
   }

        return numbers; // remove this line after done


  }
}


