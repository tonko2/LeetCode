package algorithm;

import java.util.ArrayList;
import java.util.List;

public class Problem897 {
    private List<Integer> nodes = new ArrayList<>();

    public TreeNode increasingBST(TreeNode root) {
        dfs(root);
        TreeNode ans = new TreeNode();
        TreeNode tmp = ans;
        for (Integer node : nodes) {
            tmp.right = new TreeNode(node);
            tmp = tmp.right;
        }
        return ans.right;
    }

    void dfs(TreeNode root) {
        if (root != null) {
            dfs(root.left);
            nodes.add(root.val);
            dfs(root.right);
        }
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
