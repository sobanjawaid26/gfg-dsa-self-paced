package gfg.video_questions.binary_tree;

public class DiameterOfBT {

    static int height(TreeNode root){
        if (root == null)
            return 0;
        else
            return 1 + Integer.max(height(root.left), height(root.right));
    }

    static int diameterOfBT(TreeNode root){
        if (root == null)
            return 0;
        int d1 = 1 + height(root.left) + height(root.right);
        int d2 = diameterOfBT(root.left);
        int d3 = diameterOfBT(root.right);
        return Integer.max(d1, Integer.max(d2, d3));
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

        int diameterOfBT = diameterOfBT(root);
        System.out.println(diameterOfBT);
    }
}
