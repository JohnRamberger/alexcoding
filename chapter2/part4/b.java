package chapter2.part4;

public class b {
  public static void main(String[] args) {
    Node n5 = new Node(6);
    Node n4 = new Node(5);
    Node n3 = new Node(4);
    Node n2 = new Node(3);
    Node n1 = new Node(2);

    Node[] arr = {n1, n2, n3, n4, n5};

    Node root = new Node(1, arr);
    Tree tree1 = new Tree(root);
    
    tree1.print();
  }
}
