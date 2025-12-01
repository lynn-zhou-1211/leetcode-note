package src.leetcode.editor.en;

import src.leetcode.editor.en.utils.ListNode;

public class LC19_RemoveNthNodeFromEndOfList{
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        // 快慢指针
        ListNode slow = dummy;
        ListNode fast = dummy;

        // fast先走n+1步，此时当fast指向null，slow在待删除点前面一个
        for (int i = 0; i < n + 1 && fast !=null; i++) {
            fast=fast.next;
        }
        while (fast!=null){
            slow=slow.next;
            fast= fast.next;
        }
        slow.next=slow.next.next;
        return dummy.next;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
