package com.algo.telran.algo.lessonnine.ourlinkedlist;

public class MiddleOfLinkedList {

    public static void main(String[] args) {

        // 1 - 2 - 3 - 4 - 5 - res : 3, // 1 - 2 - 3 - 4 - 5 - 6  - res : 4

        Node node6 = new Node(6, null);
        Node node5 = new Node(5, node6);
        Node node4 = new Node(4, node5);
        Node node3 = new Node(3, node4);
        Node node2 = new Node(2, node3);

        Node head = new Node(1, node2);
        MiddleOfLinkedList middleOfLinkedList = new MiddleOfLinkedList();
        System.out.println(middleOfLinkedList.getMiddleValue(head));
        int[] arr = new int[1];
        middleOfLinkedList.middle(head,0, arr);
        System.out.println(arr[0]);

    }
    //T O(n/2)
    //S O(1)
    private int getMiddleValue(Node head) {
        if (head == null) {
            return -1;
        }
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.getNext() != null) {
            slow = slow.getNext();
            fast = fast.getNext().getNext();
        }

        return slow.getData();
    }

    //T-O(N)
    //S-O(N)
    public static int middle(Node node, int n, int[]arr) {
        if (node == null)
            return n+1;
        int d = middle(node.getNext(), ++n, arr);
        if (d / 2 == n && d != -1) {
            arr[0] = node.getData();
            return -1;
        }
        return d;
    }
}
