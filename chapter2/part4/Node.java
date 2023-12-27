package chapter2.part4;

public class Node {
  int data;

  public Node[] children;

  public Node(int d) {
    data = d;
  }

  public Node(int d, Node[] c) {
    data = d;
    children = c;
  }

  public void print() {
    
    System.out.println(data);
    
    if (children != null) {
      for(int i = 0; i < children.length; i++) {
        children[i].print();
      }
    }
    
  }

  // public Node(int d, Node c) {
  //   data = d;
  //   child = c;
  // }

  // public int recurseDeeper() {
  //   if (child == null) {
  //     return data;
  //   }
  //   return child.recurseDeeper();
  // }
}
