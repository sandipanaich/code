package com.sandipan.datastructures.lists.impl;

import com.sandipan.datastructures.lists.List;

import static java.lang.String.format;

import java.util.Arrays;

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

        int lastIndex = size;
        add(lastIndex, element);
    }

    @Override
    public void add(int index, E element) {

        if(index < 0 || index > size)
            throw new ArrayIndexOutOfBoundsException(format("Cannot add element in the position %d.", index));

        int size = this.size;
        if(size == capacity)
            grow();
        int right = size;
        int left = index;
        while(left < right) {
            array[left] = array[left + 1];
            left++;
        }
        array[index] = element;
    }

    @Override
    public E set(int index, E element) {

        if(index < 0 || index >= size)
            throw new ArrayIndexOutOfBoundsException(format("Cannot set element in the position %d.", index)

        E oldElement = array[index];
        array[index] = element;
        return oldElement;
    }

    @Override
    public E get(int index) {
        if(index < 0 || index >= size)
            throw new ArrayIndexOutOfBoundsException(format("Cannot access the element in the position %d.", index));
        return this.array[index];
    }

    @Override
    public E remove(int index) {
        E element = array[index];
        while(index < size) {
            array[index] = array[index + 1];
            index++;
        }
        size--;
        return element;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public boolean contains(E element) {
        int index = 0;
        for( ; index < size; index++) {
            if(array[index].equals(element))
                break;
        }
        return index != size;
    }

    @Override
    public int indexOf(E element) {
        for(int i = 0; i < size; i++) {
            if(array[i].equals(element))
                return i;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(E element) {
        for(int i = size - 1; i >= 0; i--) {
            if(array[i].equals(element))
                return i;
        }
        return -1;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void clear() {
        int size = this.size;
        if(size == 0)
            this.array = (E[]) new Object[capacity];
        else
            this.array = (E[]) new Object[size];
        Runtime.getRuntime().gc();
    }

    @Override
    public E[] toArray() {
        E[] newArray = createArray(size);
        System.arraycopy(array, 0, newArray, 0, size);
        return newArray;
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
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
        if(newCapacity > MAX_CAPACITY)
            throw new OutOfMemoryError(format("Cannot grow the array beyond the maximum capacity %d.", MAX_CAPACITY));
        
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
