package gfg.video_questions.binary_tree;

public class LevelOrderTraversalNaive {

    static int heightOfTree(TreeNode root){
        if(root == null)
            return 0;
        return Integer.max(heightOfTree(root.left), heightOfTree(root.right)) + 1;
    }

    static void printNodesAtKDisFromRoot(TreeNode root, int k){
        if (root == null)
            return;
        if(k == 0)
            System.out.print(root.key + " ");
        else{
            printNodesAtKDisFromRoot(root.left, k - 1);
            printNodesAtKDisFromRoot(root.right, k - 1);
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

        // NAIVE solution
        int h = heightOfTree(root);
        //System.out.println(h);
        for (int i = 0; i< h; i++){
            printNodesAtKDisFromRoot(root, i);
            System.out.println();
        }
    }
}
