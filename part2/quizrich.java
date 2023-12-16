package part2;
import java.util.ArrayList;

public class quizrich {
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
    for (int i = 0; i < numbers.length; i++) {
      numbers[i] *= numbers[i];
    }
    return numbers;
  }
}
