package algorithm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Problem589 {

    private List<Integer> list = new LinkedList<>();

    public List<Integer> preorder(Node root) {
        dfs(root);
        return list;
    }

    private void dfs(Node root) {
        if (root == null) {
            return;
        }
        list.add(root.val);
        for(Node node : root.children) {
            dfs(node);
        }
    }

    class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }
}
