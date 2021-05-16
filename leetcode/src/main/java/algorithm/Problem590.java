package algorithm;

import java.util.LinkedList;
import java.util.List;

public class Problem590 {
    private List<Integer> res = new LinkedList<>();
    public List<Integer> postorder(Node root) {
        if (root == null) {
            return res;
        }
        dfs(root);
        return res;
    }

    private void dfs(Node root) {
        for(Node node : root.children) {
            dfs(node);
        }
        res.add(root.val);
    }

    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    };
}
