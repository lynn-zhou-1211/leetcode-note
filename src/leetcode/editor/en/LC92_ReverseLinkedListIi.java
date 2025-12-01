package src.leetcode.editor.en;

import src.leetcode.editor.en.utils.ListNode;

import javax.swing.plaf.basic.BasicCheckBoxUI;

public class LC92_ReverseLinkedListIi {
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
        public ListNode reverseBetween(ListNode head, int left, int right) {
            ListNode dummy = new ListNode(0);
            dummy.next = head;

            // 找到left左边的第一个节点
            ListNode cur = dummy;
            for (int i = 0; i < left - 1; i++) {
                cur = cur.next;
            }
            ListNode prevLeftNode = cur;
            ListNode leftNode = cur.next;

            ListNode prev = prevLeftNode;
            cur = leftNode;
            for (int i = left; i <= right; i++) {
                ListNode tempNext = cur.next;
                cur.next = prev;

                prev = cur;
                cur = tempNext;
            }

            // pre在right,cur 在right+1
            prevLeftNode.next = prev;
            leftNode.next = cur;

            return dummy.next;

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
