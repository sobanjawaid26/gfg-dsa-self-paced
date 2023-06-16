package gfg.video_questions.binary_tree;

public class CheckForBalancedBT {

    static int isBalanced(TreeNode root){
        if (root == null)
            return 0;
        int lh = isBalanced(root.left);
        if (lh == -1)
            return -1;
        int rh = isBalanced(root.right);
        if (rh == -1)
            return -1;
        if (Math.abs(lh - rh) > 1)
            return -1;
        else
            return Math.max(lh, rh) + 1;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(30);
        TreeNode temp1 = new TreeNode(10);
        TreeNode temp2 = new TreeNode(20);
        TreeNode temp3 = new TreeNode(10);
        TreeNode temp4 = new TreeNode(10);

        root.left = temp1;
        root.right = temp2;
        temp2.left = temp3;
        temp2.right = temp4;

        int isBalanced = isBalanced(root);
        System.out.println(isBalanced);
    }
}
