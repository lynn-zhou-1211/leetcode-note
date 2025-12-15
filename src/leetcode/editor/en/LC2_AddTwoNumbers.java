package src.leetcode.editor.en;

import src.leetcode.editor.en.utils.ListNode;

import javax.swing.plaf.ScrollBarUI;
import java.lang.constant.DynamicCallSiteDesc;
import java.util.List;

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
            ListNode dummy = new ListNode(-1);
            ListNode cur = dummy;
            int carry = 0;

            while (l1!=null || l2!=null || carry>0){
                int v1 = l1==null?0:l1.val;
                int v2 = l2==null?0:l2.val;
                int sum = v1+v2+carry;

                carry = sum/10;
                ListNode node = new ListNode(sum%10);
                cur.next= node;
                cur=node;

                l1=l1==null?l1:l1.next;
                l2=l2==null?l2:l2.next;
            }
            return dummy.next;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
