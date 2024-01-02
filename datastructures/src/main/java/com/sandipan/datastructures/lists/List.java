package com.sandipan.datastructures.lists;

public interface List<E> {

    void add(E element);
    void add(int index, E element);
    E get(int index);
    E remove(int index);
    int size();
    boolean isEmpty();
    boolean contains(E element);
    int indexOf(E element);
    int lastIndexOf(E element);
    void clear();
    E set(int index, E element);
    E[] toArray();
    String toString();
}
