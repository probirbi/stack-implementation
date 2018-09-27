/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.ericsson.assessment.task;

/**
 *
 * @author Probir
 */
public class SimpleStack implements Stack {

    private static final int MAX_SIZE = 3;
    private Object[] obj;
    private int size;

    public SimpleStack() {
        obj = new Object[MAX_SIZE];
        size = 0;
    }

    @Override
    public void push(Object o) {
        if (this.isFull()) {
            //System.out.println("Stack is full, can't push a value.");
            grow();
        }
        obj[size] = o;
        size++;
    }

    @Override
    public Object pop() {
        if (this.isEmpty()) {
            //System.out.println("Stack is empty, Cannot pop a value.");
            return null;
        } else {
            Object result = obj[size - 1];
            obj[--size] = null;
            return result;
        }
    }

    @Override
    public Object peek() {
        if (this.isEmpty()) {
            //System.out.println("Stack is empty, Cannot peek from empty stack.");
            return null;
        } else {
            Object result = obj[size - 1];
            return result;
        }
    }

    private void grow() {
        int newSize = 2 * obj.length;
        Object[] newObj;
        newObj = new Object[newSize];
        for (int i = 0; i < obj.length; i++) {
            newObj[i] = obj[i];
        }
        obj = newObj;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean isFull() {
        return size == obj.length;
    }

    @Override
    public int size() {
        return size;
    }

}
