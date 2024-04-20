
// M04 Programming Assignment (3)
// Ivy Tech Community College
// SDEV 200 - Java
// Professor Bumgardner
// Nativida Muhammad
// 14 April 2024
import java.util.ListIterator;

public class TwoWayLinkedList<E> implements MyList<E> {
  private Node<E> head, tail;
  private int size;

  @Override
  public void add(E e) {
    // Add method will be implemented here.
  }

  // Override listIterator
  @Override
  public ListIterator<E> listIterator() {
    // Implement listIterator() method here
    return null; // Null will be replaced with implementation 
  }

  private class Node<E> {
    E element;
    Node<E> next;
    Node<E> previous;

    public Node(E element) {
      this.element = element;
    }
  }
}
