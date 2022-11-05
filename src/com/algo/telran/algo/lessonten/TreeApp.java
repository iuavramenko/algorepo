package com.algo.telran.algo.lessonten;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeApp {


    /*
    Breadth First Search

            1
           /  \
        2       3
      /  \     /  \
    4     5    6   7

    4567
    23
    1

             1
           /  \
        2       3
      /  \       \
    4     5        7
                /
                8

     */

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(3);
        root.setLeft(left);
        root.setRight(right);
        TreeNode l1 = new TreeNode(4);
        TreeNode r1 = new TreeNode(5);
        left.setLeft(l1);
        left.setRight(r1);
        // TreeNode l2 = new TreeNode(6);
        TreeNode r2 = new TreeNode(7);
        // right.setLeft(l2);
        right.setRight(r2);

        TreeApp treeApp = new TreeApp();
        treeApp.traverseTree(root);

        treeApp.traverseTreeReverse(root);

    }

    private void traverseTree(TreeNode root) {
        //1.Check corner case
        if (root == null) {
            return;
        }
        //2.Create queue
        Queue<TreeNode> queue = new LinkedList<>();
        //3.Add root to queue
        queue.offer(root);
        while (!queue.isEmpty()) {  // level iteration
            int size = queue.size(); // Size of current level
            for (int i = 0; i < size; i++) {  // element iteration
                //Get node from head queue
                TreeNode node = queue.poll();                 ///       3    2  ///       3 ////  5  4  /////// 5  4  // 7 6 5 4  //
//                System.out.print(node.getValue() + " ");
                //Add left node to queue tall
                if (node.getLeft() != null) queue.offer(node.getLeft());

                //Add right node to queue tall
                if (node.getRight() != null) queue.offer(node.getRight());

            }
//            System.out.println();
        }
    }

    private void traverseTreeReverse(TreeNode root) {
        if (root == null) {
            return;
        }
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> levelList = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                levelList.add(node.getValue());
                if (node.getLeft() != null) queue.offer(node.getLeft());
                if (node.getRight() != null) queue.offer(node.getRight());
            }
            result.add(0, levelList);
        }
        for (List<Integer> list : result) {
            for (Integer integer : list) {
                System.out.print(integer + " ");
            }
            System.out.println();
        }
    }
}
