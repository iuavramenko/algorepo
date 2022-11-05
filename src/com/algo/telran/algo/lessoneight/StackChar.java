package com.algo.telran.algo.lessoneight;

public class StackChar {

    private static int STACK_SIZE = 1000;

    private int top = -1;

    private char[] arr = new char[STACK_SIZE];

    public boolean empty() {
        return top < 0;
    }

    public char peek() {
        if (top < 0) {
            System.out.println("Stack is empty");
            return 0;
        }
        return arr[top];
    }

    public char pop() {
        if (top < 0) {
            System.out.println("Stack is empty");
            return 0;
        }

        return arr[top--];
    }

    public void push(char x) {
        if (top < STACK_SIZE - 1) {
            arr[++top] = x;
        } else {
            System.out.println("Stack overflow");
        }
    }

    public void printStack() {
        for (int i = top; i >= 0; i--) {
            System.out.print(" " + arr[i]);
        }
        System.out.println();
    }
}