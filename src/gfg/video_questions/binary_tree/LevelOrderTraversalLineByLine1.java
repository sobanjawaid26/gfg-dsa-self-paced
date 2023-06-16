package gfg.video_questions.binary_tree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversalLineByLine1 {

    static void levelOrderTraversalLineByLine(TreeNode root){
        if (root == null)
            return;
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        q.add(null);
        while (q.size() > 1){
            TreeNode curr = q.poll();
            if (curr == null){
                System.out.println();
                q.add(null);
                continue;
            }
            System.out.print(curr.key + " ");
            if (curr.left != null)
                q.add(curr.left);
            if (curr.right != null)
                q.add(curr.right);
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        TreeNode temp1 = new TreeNode(20);
        TreeNode temp2 = new TreeNode(30);
        TreeNode temp3 = new TreeNode(40);
        TreeNode temp4 = new TreeNode(50);

        root.left = temp1;
        root.right = temp2;
        temp2.left = temp3;
        temp2.right = temp4;

        levelOrderTraversalLineByLine(root);
    }
}
