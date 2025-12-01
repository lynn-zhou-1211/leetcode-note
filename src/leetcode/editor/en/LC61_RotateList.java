package src.leetcode.editor.en;

import src.leetcode.editor.en.utils.ListNode;

import java.util.HashSet;

public class LC61_RotateList {
    //leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode() {}
     * ListNode(int val) { this.val = val; }
     * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    class Solution {
        public ListNode rotateRight(ListNode head, int k) {
            // 连接成环，找 head 和 tail

            // 边界 len==0/1; k=0
            if (head == null || head.next == null || k == 0) {
                return head;
            }

            // 找 len
            ListNode cur = head;
            int len = 1;
            while (cur.next != null) {
                len++;
                cur = cur.next;
            }
            cur.next = head;

            int index = len-k%len;
            for (int i = 0; i < index; i++) {
                cur=cur.next;
            }
            ListNode newTail = cur;
            ListNode newHead = cur.next;
            newTail.next= null;

            return newHead;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
