package src.leetcode.editor.en;

import src.leetcode.editor.en.utils.ListNode;

import javax.swing.plaf.ScrollBarUI;

public class LC2_AddTwoNumbers {
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
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            // dummy node
            ListNode dummy = new ListNode(0);
            ListNode cur = dummy;
            int carry = 0;

            // while i or 2 not finished ,or carry not finished
            while (l1 != null || l2 != null || carry != 0) {
                int x = l1 == null ? 0 : l1.val;
                int y = l2 == null ? 0 : l2.val;

                int sum = x + y + carry;
                carry = sum / 10;

                cur.next = new ListNode(sum % 10);

                cur = cur.next;
                if (l1!= null) l1 = l1.next;
                if (l2!= null) l2 = l2.next;
            }

            // return
            return dummy.next;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
