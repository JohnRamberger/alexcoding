package chapter2.part3;

class a {
  public static void main(String[] args) {
    int[] sorted = {1, 2, 3, 4, 5};

    int output = binarySearch(sorted, 2);
    System.out.println(output);
  }

  static int binarySearch(int[] arr, int target) {
    if (arr.length == 0) {
      return -999;
    }

    int midIndex = (arr.length - 1) / 2;
    int midValue = arr[midIndex];

    if (target > midValue) {
      // subset
      int[] newArr = new int[arr.length - midIndex - 1];
      int j = 0;
      for (int i = midIndex + 1; i < arr.length; i++) {
        newArr[j] = arr[i];
        j++;
      }
      return arr.length - newArr.length - 1 +  binarySearch(newArr, target);
    }
    else if (target < midValue) {
      int[] newArr = new int[midIndex];
      for (int i = 0; i < midIndex; i++) {
        newArr[i] = arr[i];
      }
      return arr.length - newArr.length - 1 + binarySearch(newArr, target);
    }
    else {
      return midIndex;
    }
  }
}