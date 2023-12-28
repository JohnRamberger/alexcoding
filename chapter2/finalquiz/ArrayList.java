package chapter2.finalquiz;

/**
 * TODO: Complete the following class so that it passes all tests in quiz.java.
 * 
 * NOTES:
 * 1. Do not use any built-in Java classes (like java.util.ArrayList).
 * 2. You must use a backing array to store the elements. Ex: if T is Integer, then you must use an Integer[] to store the elements.
 * 3. Start the array with a capacity of 10 and double the capacity whenever the array exceeds its capacity.
 * 4. Whenever the array exceeds its capacity, you must create a new array with double the capacity and copy all elements over.
 * 5. You may assume that the list will only contain non-null elements.
 * 6. You may assume that the list will only contain elements of type T.
 */

  
/**
 * A list of elements. This list is backed by an array.
 * @param <T> the type of elements in the list
 */
public class ArrayList<T> {
  // TODO: Define the instance variables you need here.

  /**
   * Adds the given value to the end of the list.
   * @param value
   */
  public void add(T value) {
    // TODO: Implement this method.
    throw new UnsupportedOperationException("ArrayList.add(T value) needs to be implemented.");
  }

  /**
   * Adds the given value at the given index.
   * @param index
   * @param value
   */
  public void add(int index, T value) {
    // TODO: Implement this method.
    throw new UnsupportedOperationException("ArrayList.add(int index, T value) needs to be implemented.");
  }

  /**
   * Returns the value at the given index.
   * @param index
   * @return the value at the given index
   */
  public T get(int index) {
    // TODO: Implement this method.
    throw new UnsupportedOperationException("ArrayList.get(int index) needs to be implemented.");
  }

  /**
   * Sets the value at the given index to the given value.
   * @param index
   * @param value
   */
  public void set(int index, T value) {
    throw new UnsupportedOperationException("ArrayList.set(int index, T value) needs to be implemented.");
  }

  /**
   * Removes the value at the given index.
   * @param index
   */
  public void remove(int index) {
    // TODO: Implement this method.
    throw new UnsupportedOperationException("ArrayList.remove(int index) needs to be implemented.");
  }

  /**
   * Returns the number of elements in the list.
   * @return the number of elements in the list
   */
  public int size() {
    // TODO: Implement this method.
    throw new UnsupportedOperationException("ArrayList.size() needs to be implemented.");
  }

  /**
   * Returns true if the list is empty, false otherwise.
   * @return true if the list is empty, false otherwise
   */
  public boolean isEmpty() {
    // TODO: Implement this method.
    throw new UnsupportedOperationException("ArrayList.isEmpty() needs to be implemented.");
  }

  /**
   * Returns true if the list contains the given value, false otherwise.
   * @param value
   * @return true if the list contains the given value, false otherwise
   */
  public boolean contains(T value) {
    // TODO: Implement this method.
    throw new UnsupportedOperationException("ArrayList.contains(T value) needs to be implemented.");
  }

  /**
   * Returns the index of the first occurrence of the given value in the list, or -1 if the list does not contain the value.
   * @param value
   * @return the index of the first occurrence of the given value in the list, or -1 if the list does not contain the value
   */
  public int indexOf(T value) {
    // TODO: Implement this method.
    throw new UnsupportedOperationException("ArrayList.indexOf(T value) needs to be implemented.");
  }

  /**
   * Returns the index of the last occurrence of the given value in the list, or -1 if the list does not contain the value.
   * @param value
   * @return the index of the last occurrence of the given value in the list, or -1 if the list does not contain the value
   */
  public int lastIndexOf(T value) {
    // TODO: Implement this method.
    throw new UnsupportedOperationException("ArrayList.lastIndexOf(T value) needs to be implemented.");
  }

  /**
   * Removes all elements from the list.
   */
  public void clear() {
    // TODO: Implement this method.
    throw new UnsupportedOperationException("ArrayList.clear() needs to be implemented.");
  }

  /**
   * Returns a string representation of the list.
   * @return a string representation of the list
   */
  public String toString() {
    // This method is optional but recommended for debugging purposes.
    // OPTIONAL: Implement this method.
    throw new UnsupportedOperationException("ArrayList.toString() needs to be implemented.");
  }
}
