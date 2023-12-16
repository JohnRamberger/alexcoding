package quizzespart2;

public class yoojin1 {
  public static void main(String[] args) {
    Boolean[] before = {true, false, true};
    Boolean[] after = opposite(before);

    Boolean[] shouldBe = {false, true, false};

    if (java.util.Arrays.equals(after, shouldBe)) {
      System.out.println("correct!");
    } else {
      System.out.println("incorrect!");
      System.out.println("your answer: " + java.util.Arrays.toString(after));
    }
  }

  static Boolean[] opposite(Boolean[] before) { 
    // TODO: Return the opposite of each element in the array. [true, false, true] -> [false, true, false]
    // only change inside of this method
    //from here
    

int i=0;
int rev = i+1;

before[0]=before[1];

while (i<before.length){

before[i] = before [rev];

i++;
rev--;

}





    return before;
    // to here
  }
}
