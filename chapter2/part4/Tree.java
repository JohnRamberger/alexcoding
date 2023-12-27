package chapter2.part4;

public class Tree {
  Node root;

  public Tree(Node root) {
    this.root = root;
  }

  public void print() {
    root.print();
  }

  // void printDeepestValue() {
  //   int data = root.recurseDeeper();

  //   System.out.println(data);
  // }
}


