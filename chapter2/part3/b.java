package chapter2.part3;

// O(1) = constant y= 1
// O(logn) = logarithmic
// O(n) = linear y= x
// O(nlogn)
// O(n^2) = exponential
// O(n^3) = cubic

// O(n!)
// O(2^n)


public class b {
  public static void main(String[] args) {
    a(10);

    int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};

    
  }

  static void a(int n) {
    for (int i = 0; i < n; i++) {

      for (int j = 0; j < n; j++) {
        System.out.println("hello");
      }

    }  
    // O(n^2)
      

    for (int j = 0; j < n; j++) {
      System.out.println("hello");
    }
    // O(n)

    // O(n^2) + O(n) = O(n^2)
  }
}
