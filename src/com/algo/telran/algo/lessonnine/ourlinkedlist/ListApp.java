package com.algo.telran.algo.lessonnine.ourlinkedlist;

public class ListApp {

    public static void main(String[] args) {
        // 1 - 2 -3 - 4 - 5
        Node node5 = new Node(5, null);
        Node node4 = new Node(4, node5);
        Node node3 = new Node(3, node4);
        Node node2 = new Node(2, node3);
        Node head = new Node(1, node2);

        ListApp listApp = new ListApp();

        listApp.print(head);
        int value = listApp.getNode(head, 3);
        System.out.println(value);

        MyLinkedList myLinkedList = new MyLinkedList();


    }

    private void print(Node node) {
        while (node != null ){
            System.out.print(node.getData() + " ");
            node = node.getNext();
        }
    }

    private int getNode(Node node, int number) {
        if (number == 1 && node == null)  {
            //
        }
        while (node != null && number > 1){
            node = node.getNext();
            number--;
        }

        return node.getData();
    }
}
