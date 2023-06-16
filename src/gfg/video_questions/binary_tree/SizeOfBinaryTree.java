package gfg.video_questions.binary_tree;

public class SizeOfBinaryTree {

    static int sizeOfBinaryTree(TreeNode root){
        if (root == null)
            return 0;
        else
            return 1 + sizeOfBinaryTree(root.left) + sizeOfBinaryTree(root.right);
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

        int size = sizeOfBinaryTree(root);
        System.out.println(size);
    }
}
