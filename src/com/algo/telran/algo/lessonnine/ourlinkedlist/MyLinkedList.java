package com.algo.telran.algo.lessonnine.ourlinkedlist;

public class MyLinkedList {

    private Node head;
    private int size;

    public MyLinkedList() {
        this.head = null;
        this.size = 0;
    }

    //O(1) - Time complexity
    public void pushToHead(int data) {
        Node node = new Node(data);
        node.setNext(head);
        head = node;
        size++;

    }

    //O(n) - Time complexity
    //O(1) - if use additional variable with link to last element
    public void pushToTail(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            size++;
            return;
        }
        Node curr = head;
        while (curr.getNext() != null) {
            curr = curr.getNext();
        }
        curr.setNext(node);
    }

    //O(1)
    public boolean removeFirst() {
        if (head == null) {
            return false;
        }
        Node curr = head;
        head = curr.getNext();
        curr.setNext(null);
        size--;
        return true;
    }

    //O(n) - Time complexity
    //O(1) - if use additional variable with link to last element
    public boolean removeLast() {
        if (head == null) {
            return false;
        }
        Node curr = head;
        Node prev = null;
        while (curr.getNext() != null) {
            prev = curr;
            curr = curr.getNext();
        }
        if (prev != null) {
            prev.setNext(null);
        }
        return true;
    }

    public void print() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.getData() + " ");
            curr = curr.getNext();
        }
    }

  // Home
 //  pushToIndex(int index, int data)
 //  remove(int index)
 //  get(int index)

}
