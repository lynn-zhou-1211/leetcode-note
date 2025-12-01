package src.leetcode.editor.en;
import src.leetcode.editor.en.utils.ListNode;
public class LC86_PartitionList{
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
    public ListNode partition(ListNode head, int x) {
        // 两个list，拼接
        ListNode dummyL = new ListNode(0);
        ListNode dummyG = new ListNode(0);
        ListNode curL = dummyL;
        ListNode curG = dummyG;

        ListNode cur = head;
        while (cur!=null){
            if(cur.val<x){
                curL.next=cur;
                curL=curL.next;
            }else {
                curG.next=cur;
                curG=curG.next;
            }

            cur=cur.next;
        }
        curL.next = dummyG.next;
        curG.next = null;
        return dummyL.next;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
