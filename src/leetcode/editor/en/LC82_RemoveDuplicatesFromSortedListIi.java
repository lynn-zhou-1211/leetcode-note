package src.leetcode.editor.en;

import src.leetcode.editor.en.utils.ListNode;

public class LC82_RemoveDuplicatesFromSortedListIi{
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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode pre = dummy;
        ListNode cur = head;
        while (cur!= null){
            ListNode start = cur;
            while (cur.next!=null && cur.val==cur.next.val){
                cur=cur.next;
            }
            ListNode end = cur;
            if(start==end){ // 不用跳过，前进一个
                pre = cur;
                cur=cur.next;
            }
            else {  // 跳过
                pre.next = cur.next;
                cur=cur.next;
            }
        }

        return dummy.next;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
