package com.algo.telran.algo.lessonten;

public class DFSExample {

     /*
         Deep First Search
        10
            1
           /  \
        2       3
      /  \     /  \
    4     5    6   7



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
        TreeNode l2 = new TreeNode(6);
        TreeNode r2 = new TreeNode(7);
        right.setLeft(l2);
        right.setRight(r2);

        int target = 10;

        DFSExample dfsExample = new DFSExample();
        boolean exists = dfsExample.pathExists(root, target);
        System.out.println("Path exists : " + exists);

    }

    private boolean pathExists(TreeNode node, int sum) {
        if (node == null) {
            return false;
        }
        if (node.getRight() == null && node.getLeft() == null) {
            return sum == node.getValue();
        }
        sum -= node.getValue();
        return pathExists(node.getLeft(), sum) || pathExists(node.getRight(), sum);
    }

}
