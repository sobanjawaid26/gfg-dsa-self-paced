package gfg.video_questions.binary_tree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversalLineByLine2 {

    static void levelOrderTraversalLineByLine2(TreeNode root){
        if (root == null)
            return;
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        while (q.isEmpty() == false){
            int count = q.size();
            for (int i = 0; i< count; i++){
                TreeNode curr = q.poll();
                System.out.print(curr.key + " ");
                if (curr.left != null)
                    q.add(root.left);
                if (curr.right != null)
                    q.add(root.right);
            }
            System.out.println();
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

        levelOrderTraversalLineByLine2(root);
    }
}
