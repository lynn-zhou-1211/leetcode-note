package src.leetcode.editor.en;

import src.leetcode.editor.en.utils.ListNode;

import java.util.List;

public class LC148_SortList {
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
        public ListNode sortList(ListNode head) {
            // base case
            if (head == null || head.next == null) {
                return head;
            }

            // divide
            ListNode mid = getMid(head);
            ListNode rightHead = mid.next;
            mid.next=null;

            // conquer
            ListNode left = sortList(head);
            ListNode right = sortList(rightHead);

            // merge
            return merge(left,right);
        }

        private ListNode getMid(ListNode head) {
            ListNode slow = head;
            ListNode fast = head.next;

            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow;
        }

        private ListNode merge(ListNode p, ListNode q) {
            ListNode dummy = new ListNode(0);
            ListNode cur = dummy;
            while (p != null && q != null) {
                if (p.val > q.val) {
                    cur.next = q;
                    q = q.next;
                } else {
                    cur.next = p;
                    p = p.next;
                }
                cur = cur.next;
            }
            if (p != null) {
                cur.next = p;
            }
            if (q != null) {
                cur.next = q;
            }
            return dummy.next;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
