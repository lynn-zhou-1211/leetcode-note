package src.leetcode.editor.en;


import java.util.ArrayDeque;
import java.util.Queue;

public class LC117_PopulatingNextRightPointersInEachNodeIi {
    //leetcode submit region begin(Prohibit modification and deletion)
// Definition for a Node.
    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    }

    ;

    class Solution {
        public Node connect(Node root) {
            if (root == null) return null;

            Queue<Node> queue = new ArrayDeque<>();
            queue.offer(root);

            while (!queue.isEmpty()) {
                int size = queue.size();
                for (int i = 0; i < size; i++) {
                    Node cur = queue.poll();
                    if (cur.left != null) queue.offer(cur.left);
                    if (cur.right != null) queue.offer(cur.right);
                    if (i < size - 1) cur.next = queue.peek();
                }
            }
            return root;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
