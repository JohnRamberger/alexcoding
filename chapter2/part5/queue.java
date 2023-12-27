package chapter2.part5;

// import java.util.ArrayDeque;
// import java.util.LinkedList;
// import java.util.Queue;
import java.util.Stack;

public class queue {
  public static void main(String[] args) {
    // Queue<Integer> q = new LinkedList<Integer>();
    // Queue<Integer> q2 = new ArrayDeque<Integer>();

    // q.add(5);
    // q.add(6);
    // q.add(7);
    // print(q.toString());
    
    // int rem = q.remove();
    // print(rem);
    // print(q.toString());
    
    // int rem2 = q.peek();
    // print(rem2);
    // print(q.toString());

    Stack<Integer> stack = new Stack<Integer>();

    stack.add(5);
    stack.add(6);
    stack.add(7);

    print(stack.toString());

    int rem = stack.pop();
    print(rem);
    print(stack.toString());
  }

  static void print(String s) {
    System.out.println(s);
  }

  static void print(int s) {
    System.out.println(s);
  }
}
