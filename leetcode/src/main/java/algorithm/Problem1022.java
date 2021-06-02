package algorithm;

public class Problem1022 {

    public int sumRootToLeaf(TreeNode root) {
        return sumNodes(root, 0);
    }

    private int sumNodes(TreeNode root, int sum) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 2 * sum + root.val;
        }
        return sumNodes(root.left, 2 * sum + root.val) + sumNodes(root.right, 2 * sum + root.val);
    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
