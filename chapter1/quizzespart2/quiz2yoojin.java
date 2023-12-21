package part2;
import java.util.ArrayList; // need for Arraylist

public class quiz2yoojin {
  public static void main(String[] args) {
    String[] before = {"a", "b", "c", "d", "e"};
    String[] after = reverse(before);

    String[] shouldBe = {"e", "d", "c", "b", "a"};

    if (java.util.Arrays.equals(after, shouldBe)) {
      System.out.println("correct!");
    } else {
      System.out.println("incorrect!");
      System.out.println("your answer: " + java.util.Arrays.toString(after));
    }
  }

  static String[] reverse(String[] before) {
    // TODO: Reverse all of the elements in the array. [a,b,c,d,e] -> [e,d,c,b,a]
    // only change inside of this method
    //from here

int i = 0;
int rev = before.length-1;


//ArrayList<String> newList = new ArrayList<String>(); 

String[] newList = new String[5];

while (i < before.length){
newList[i] = before[rev];

i++;
rev--;
}



  //i=0 rev=4 a,e i=1 rev=3     i=2 rev=2   i=3 rev=1   i=4 rev=0

    return newList;
    // to here
  }
}
