package gfg.video_questions.binary_tree;

public class HeightOfBinaryTree {

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

        int height = height(root);
        System.out.println(height);
    }

    static int height(TreeNode root){
        if (root == null)
            return 0;
        else
            return Math.max(height(root.left), height(root.right)) + 1;
    }
}
