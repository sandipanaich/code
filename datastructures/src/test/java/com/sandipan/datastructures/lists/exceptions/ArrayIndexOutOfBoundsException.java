package com.sandipan.datastructures.lists.exceptions;

public class ArrayIndexOutOfBoundsException extends RuntimeException{

    public ArrayIndexOutOfBoundsException() {
        super("Cannot access the index in the Array List.");
    }
    public ArrayIndexOutOfBoundsException(String message) {
        super(message);
    }
}
