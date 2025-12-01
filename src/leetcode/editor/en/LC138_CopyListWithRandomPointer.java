package src.leetcode.editor.en;

import src.leetcode.editor.en.utils.Node;

import java.util.HashMap;
import java.util.Map;

public class LC138_CopyListWithRandomPointer {
    //leetcode submit region begin(Prohibit modification and deletion)
/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

    class Solution {
        public Node copyRandomList(Node head) {
            Map<Node, Node> map = new HashMap<>();
            Node cur = head;
            while (cur != null) {
                map.put(cur, new Node(cur.val));
                cur= cur.next;
            }
            cur = head;
            while (cur!=null){
                map.get(cur).next = map.get(cur.next);
                map.get(cur).random = map.get(cur.random);
                cur= cur.next;
            }
            return map.get(head);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
