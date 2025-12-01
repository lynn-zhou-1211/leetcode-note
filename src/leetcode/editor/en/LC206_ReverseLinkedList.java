package src.leetcode.editor.en;

import src.leetcode.editor.en.utils.ListNode;
import src.leetcode.editor.en.utils.Node;

public class LC206_ReverseLinkedList{
    //leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode cur = head;

        while (cur!=null){
            ListNode nextTemp = cur.next;
            cur.next = prev;

            prev= cur;
            cur = nextTemp;
        }
        return prev;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
