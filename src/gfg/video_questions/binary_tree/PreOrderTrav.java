package gfg.video_questions.binary_tree;

public class PreOrderTrav {

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

        preOrder(root);
    }

    static void preOrder(TreeNode root){
        if(root != null){
            System.out.println(root.key);
            preOrder(root.left);
            preOrder(root.right);
        }
    }
}
