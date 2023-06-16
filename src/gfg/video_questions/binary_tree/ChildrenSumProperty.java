package gfg.video_questions.binary_tree;

public class ChildrenSumProperty {

    static boolean isChildrenSumProperty(TreeNode root){
        if (root == null)
            return true;
        if (root.left == null && root.right == null)
            return true;
        int sum = 0;
        if (root.left != null)
            sum += root.left.key;
        if (root.right != null)
            sum += root.right.key;
        return (root.key == sum) &&
                isChildrenSumProperty(root.left) &&
                isChildrenSumProperty(root.right);
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

        boolean isChildrenSumProperty = isChildrenSumProperty(root);
        System.out.println(isChildrenSumProperty);
    }
}
