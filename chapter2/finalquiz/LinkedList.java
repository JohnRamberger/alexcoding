package chapter2.finalquiz;

/**
 * TODO: Complete the following class so that it passes all tests in quiz.java.
 * 
 * NOTES:
 * 1. Do not use any built-in Java classes (like java.util.LinkedList).
 * 2. You must use the given Node<T> class to store the elements. (This is at the bottom of this file.)
 * 3. You must use a doubly-linked list to store the elements. Ex: Each node in the list must have a reference to the next node and the previous node.
 * 4. You may assume that the list will only contain non-null elements.
 * 5. You may assume that the list will only contain elements of type T.
 */

/**
 * A doubly-linked list of elements. Uses Node<T> to store the elements.
 * @param <T> the type of elements in the list
 */
public class LinkedList<T> {
  // TODO: Define the instance variables you need here.

  /**
   * Adds the given value to the end of the list.
   * @param value
   */
  void add(T value) {
    // TODO: Implement this method.
    throw new UnsupportedOperationException("LinkedList.add(T value) needs to be implemented.");
  }

  /**
   * Adds the given value at the given index.
   * @param index
   * @param value
   */
  void add(int index, T value) {
    // TODO: Implement this method.
    throw new UnsupportedOperationException("LinkedList.add(int index, T value) needs to be implemented.");
  }

  /**
   * Returns the value at the given index.
   * @param index
   * @return the value at the given index
   */
  T get(int index) {
    // TODO: Implement this method.
    throw new UnsupportedOperationException("LinkedList.get(int index) needs to be implemented.");
  }

  /**
   * Sets the value at the given index to the given value.
   * @param index
   * @param value
   */
  void set(int index, T value) {
    // TODO: Implement this method.
    throw new UnsupportedOperationException("LinkedList.set(int index, T value) needs to be implemented.");
  }

  /**
   * Removes the value at the given index.
   * @param index
   */
  void remove(int index) {
    // TODO: Implement this method.
    throw new UnsupportedOperationException("LinkedList.remove(int index) needs to be implemented.");
  }

  /**
   * Returns the number of elements in the list.
   * @return the number of elements in the list
   */
  int size() {
    // TODO: Implement this method.
    throw new UnsupportedOperationException("LinkedList.size() needs to be implemented.");
  }

  /**
   * Returns true if the list is empty, false otherwise.
   * @return true if the list is empty, false otherwise
   */
  boolean isEmpty() {
    // TODO: Implement this method.
    throw new UnsupportedOperationException("LinkedList.isEmpty() needs to be implemented.");
  }

  /**
   * Returns true if the list contains the given value, false otherwise.
   * @param value
   * @return true if the list contains the given value, false otherwise
   */
  boolean contains(T value) {
    // TODO: Implement this method.
    throw new UnsupportedOperationException("LinkedList.contains(T value) needs to be implemented.");
  }

  /**
   * Returns the index of the given value, or -1 if the value is not found.
   * @param value
   * @return the index of the given value, or -1 if the value is not found
   */
  int indexOf(T value) {
    // TODO: Implement this method.
    throw new UnsupportedOperationException("LinkedList.indexOf(T value) needs to be implemented.");
  }

  /**
   * Returns the index of the last occurrence of the given value, or -1 if the value is not found.
   * @param value
   * @return the index of the last occurrence of the given value, or -1 if the value is not found
   */
  int lastIndexOf(T value) {
    // TODO: Implement this method.
    throw new UnsupportedOperationException("LinkedList.lastIndexOf(T value) needs to be implemented.");
  }

  /**
   * Removes all elements from the list.
   */
  void clear() {
    // TODO: Implement this method.
    throw new UnsupportedOperationException("LinkedList.clear() needs to be implemented.");
  }

  /**
   * Returns a string representation of the list.
   * @return a string representation of the list
   */
  public String toString() {
    // This method is optional but recommended for debugging purposes.
    // OPTIONAL: Implement this method.
    throw new UnsupportedOperationException("LinkedList.toString() needs to be implemented.");
  }
}

/**
 * YOU DO NOT NEED TO EDIT THIS CLASS. YOU WILL ONLY NEED TO USE IT.
 * 
 * A node in a doubly-linked list.
 * @param <T> the type of value stored in the node
 */
class Node<T> {
  T value;
  Node<T> next;
  Node<T> prev;

  Node(T value) {
    this.value = value;
  }

  Node(T value, Node<T> next, Node<T> prev) {
    this.value = value;
    this.next = next;
    this.prev = prev;
  }

  @Override
  public String toString() {
    return value.toString();
  }

  @Override
  public boolean equals(Object other) {
    if (other instanceof Node<?>) {
      Node<?> otherNode = (Node<?>) other;
      return value.equals(otherNode.value);
    }
    return false;
  }
}