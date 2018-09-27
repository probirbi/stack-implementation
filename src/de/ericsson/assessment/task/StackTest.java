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
public class StackTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Stack stack = new SimpleStack();
        System.out.println("Stack element: " + stack.size());
        System.out.println("Peek element: " + stack.peek());
        System.out.println("The Stack is empty: " + stack.isEmpty());
        System.out.println();
        stack.push(2);
        stack.push(4);
        System.out.println("Stack element: " + stack.size());
        System.out.println("Peek element: " + stack.peek());
        System.out.println("The Stack is empty: " + stack.isEmpty());
        System.out.println("The Stack is Full: " + stack.isFull());
        System.out.println();
        stack.push(6.98);
        stack.pop();
        stack.push(8.45);
        System.out.println("Stack element: " + stack.size());
        System.out.println("The Stack is Full: " + stack.isFull());
        System.out.println();
        stack.push(10.457);
        System.out.println("Stack element: " + stack.size());
        System.out.println("The Stack is Full: " + stack.isFull());
        System.out.println();
        stack.push(12.8795);
        stack.push("First");
        stack.push("Second");
        stack.push("Third");
        System.out.println("Stack element: " + stack.size());
        System.out.println("Peek element: " + stack.peek());
        System.out.println();
        stack.push(16);
        System.out.println("Stack element: " + stack.size());
        System.out.println("The Stack is Full: " + stack.isFull());
        System.out.println();
        stack.push(18);
        stack.push(20);
        stack.push(true);
        stack.push(false);
        System.out.println("Peek element: " + stack.peek());
        System.out.println("Stack element: " + stack.size());
        System.out.println();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println("Stack element: " + stack.size());
        System.out.println("Peek element: " + stack.peek());
        System.out.println("The Stack is empty: " + stack.isEmpty());
        System.out.println();
        stack.pop();
        stack.pop();        
        System.out.println("Peek element: " + stack.peek());        
        System.out.println("Stack element: " + stack.size());
        System.out.println("The Stack is empty: " + stack.isEmpty());
    }

}
