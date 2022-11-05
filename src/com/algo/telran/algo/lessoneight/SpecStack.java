package com.algo.telran.algo.lessoneight;

import java.util.Stack;

public class SpecStack {

    private Stack<Integer> helper = new Stack<>();

    /// 18 19 29 15 16
    //getMin() - 15;
    //pop()
    /// 18 19 29 15
    //getMin() - 15
    //pop()
    /// 18 19 29
    //getMin() - 18

    /// 16 29 15 19 18
    /// 16

    /// 16 15 29 19 18
    // getMin() - 15
    // pop()
    // 16 15 29 19
    // getMin() - 15

    private static int STACK_SIZE = 1000;

    private int top = -1;

    private int[] arr = new int[STACK_SIZE];

    public boolean empty() {
        return top < 0;
    }

    public int peek() {
        if (top < 0) {
            System.out.println("Stack is empty");
            return 0;
        }
        return arr[top];
    }

    public int pop() {
        if (top < 0) {
            System.out.println("Stack is empty");
            return 0;
        }

        return arr[top--];
    }

    public void push(int x) {
        if (top < STACK_SIZE - 1) {
            arr[++top] = x;
            System.out.println("Added " + x + " to stack");
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

    public int getMin() {
        return helper.peek();
    }
}