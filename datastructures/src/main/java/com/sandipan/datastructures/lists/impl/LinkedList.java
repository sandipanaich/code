package com.sandipan.datastructures.lists.impl;

import com.sandipan.datastructures.lists.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class LinkedList<E> implements List<E> {

    private Node<E> head;
    private Node<E> last;

    public LinkedList() {
    }

    @Override
    public void add(E element) {

        Node<E> node = new Node<>(element);

        if(head == null) {
            head = last = node;
            return;
        }

        last.setNext(node);
        last = node;
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

    @Data
    private class Node<E> {

        private E element;
        private Node<E> next;

        public Node(E element) {
            this.element = element;
        }
    }
}
