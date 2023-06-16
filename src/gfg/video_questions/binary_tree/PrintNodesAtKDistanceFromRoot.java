package gfg.video_questions.binary_tree;

public class PrintNodesAtKDistanceFromRoot {

    static void printNodesAtKDistanceFromRoot(TreeNode root, int k){
        if(root == null)
            return;
        if (k == 0)
            System.out.print(root.key + " ");
        else{
            printNodesAtKDistanceFromRoot(root.left, k - 1);
            printNodesAtKDistanceFromRoot(root.right, k - 1);
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

        printNodesAtKDistanceFromRoot(root, 1);
    }
}
