package gfg.video_questions.binary_tree;

public class PrintLeftViewOfBTRecursive {
    static int maxLevel = 0;
    static void printLeftViewOfBT(TreeNode root){
        printLeft(root, 1);
    }
    static void printLeft(TreeNode root, int level){
        int maxLevel = 0;
        if(root == null)
            return;
        if(maxLevel < level){
            System.out.print(root.key + " ");
            maxLevel = level;
        }
        printLeft(root.left, level + 1);
        printLeft(root.right, level + 1);
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

        printLeftViewOfBT(root);
    }
}
