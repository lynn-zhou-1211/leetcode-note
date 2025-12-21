package src.leetcode.editor.en;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LC133_CloneGraph {
    class Node {
        public int val;
        public List<Node> neighbors;

        public Node() {
            val = 0;
            neighbors = new ArrayList<Node>();
        }

        public Node(int _val) {
            val = _val;
            neighbors = new ArrayList<Node>();
        }

        public Node(int _val, ArrayList<Node> _neighbors) {
            val = _val;
            neighbors = _neighbors;
        }
    }
    //leetcode submit region begin(Prohibit modification and deletion)
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

    class Solution {
        private Map<Node,Node> visited = new HashMap<>();
        public Node cloneGraph(Node node) {
            if(node==null) return null;
            // 已经访问过就直接取出
            if(visited.containsKey(node)) return visited.get(node);
            // 拷贝当前node到新节点
            Node cloneNode = new Node(node.val,new ArrayList<>());
            // 标记为已访问，遍历邻居，添加neighbors
            visited.put(node,cloneNode);
            for (Node neighbor : node.neighbors) {
                cloneNode.neighbors.add(cloneGraph(neighbor));
            }

            return cloneNode;
        }

    }
//leetcode submit region end(Prohibit modification and deletion)

}
