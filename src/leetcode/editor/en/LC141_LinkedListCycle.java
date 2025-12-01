package src.leetcode.editor.en;

import src.leetcode.editor.en.utils.ListNode;

public class LC141_LinkedListCycle {
    //leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for singly-linked list.
     * class ListNode {
     * int val;
     * ListNode next;
     * ListNode(int x) {
     * val = x;
     * next = null;
     * }
     * }
     */
    public class Solution {
        public boolean hasCycle(ListNode head) {
            // two node, if meet ,cycle
            ListNode dummy = new ListNode(0);
            dummy.next = head;

            ListNode slow = dummy;
            ListNode fast = head;

            while (fast != null) {
                if (slow == fast) return true;
                slow = slow.next;
                if (fast.next != null) fast = fast.next.next;
                else break;
            }
            return false;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
