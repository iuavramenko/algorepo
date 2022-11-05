package com.algo.telran.algo.lessoneight;

public class StackExampleApp {

    public static void main(String[] args) {

        SpecStack specStack = new SpecStack();
        specStack.push(10);
        specStack.push(5);
        specStack.push(15);
        specStack.printStack();

        int pop = specStack.pop();
        System.out.println("Last element = " + pop);
        specStack.printStack();
    }

}
