package gfg.video_questions.binary_tree;

import java.util.LinkedList;
import java.util.Queue;

public class MaxWidthOfBT {

    static int maxWidthOfBT(TreeNode root){
        if (root == null)
            return 0;
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        int res = 0;
        while (!q.isEmpty()){
            int count = q.size();
            res = Integer.max(res, count);
            for (int i = 0; i< count; i++){
                TreeNode curr = q.poll();
                if (curr.left != null)
                    q.add(curr.left);
                if (curr.right != null)
                    q.add(curr.right);
            }
        }
        return res;
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

        int maxWidth = maxWidthOfBT(root);
        System.out.println(maxWidth);
    }
}
