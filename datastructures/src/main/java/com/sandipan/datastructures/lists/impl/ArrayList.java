package com.sandipan.datastructures.lists.impl;

import com.sandipan.datastructures.lists.List;
public class ArrayList<E> implements List<E> {

    private static final int DEFAULT_CAPACITY = 10;
    private static final int MAX_CAPACITY = Integer.MAX_VALUE - (int)(Math.pow(2,5));
    private int size;
    private int capacity;
    private E[] array;

    public ArrayList() {
        this(DEFAULT_CAPACITY);
    }

    @SuppressWarnings("unchecked")
    public ArrayList(int capacity) {
        this.array = (E[]) new Object[size];
        this.size = 0;
        this.capacity = capacity;
    }

    @Override
    public void add(E element) {

    }

    @Override
    public void add(int index, E element) {

    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public E remove(int index) {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(E element) {
        return false;
    }

    @Override
    public int indexOf(E element) {
        return 0;
    }

    @Override
    public int lastIndexOf(E element) {
        return 0;
    }

    @Override
    public void clear() {

    }

    @Override
    public E set(int index, E element) {
        return null;
    }

    @Override
    public E[] toArray() {
        return null;
    }

    @Override
    public String toString() {
        return null;
    }

    private void checkAndGrow() {
        if(!isCapacityAvailable()) {
            grow();
        }
    }

    private boolean isCapacityAvailable() {
        return size < capacity;
    }

    private void grow() {
        int currentSize = this.size;
        int newCapacity = currentSize + DEFAULT_CAPACITY;
        E[] newArray = createArray(newCapacity);
        this.capacity = newCapacity;
        System.arraycopy(array, 0, newArray, 0, currentSize);
    }

    @SuppressWarnings("unchecked")
    private E[] createArray(int capacity) {
        this.capacity = capacity;
        return (E[]) new Object[capacity];
    }
}
