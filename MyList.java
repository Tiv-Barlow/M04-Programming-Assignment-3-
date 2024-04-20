//M04 Programming Assignment (3)
//Ivy Tech Community College
//SDEV 200 - Java
//Professor Bumgardner
//Nativida Muhammad
//14 April 2024

import java.util.ListIterator;

public interface MyList<E> {
  void add(E e);

  void add(int index, E e);

  E remove(int index);

  boolean contains(E e);

  int indexOf(E e);

  E get(int index);

  int size();

  ListIterator<E> listIterator();

  ListIterator<E> listIterator(int index);
}
