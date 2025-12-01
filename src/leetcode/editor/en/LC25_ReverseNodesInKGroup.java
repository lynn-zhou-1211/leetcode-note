package src.leetcode.editor.en;

import src.leetcode.editor.en.utils.ListNode;

public class LC25_ReverseNodesInKGroup{
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
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k == 1) return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        // pre: 上一组的结尾
        // end: 当前组的结尾 (用于判断够不够k个，以及定位截断点)
        ListNode pre = dummy;
        ListNode end = dummy;

        while (end.next != null) {
            // 1. 往前走 k 步，看看够不够 k 个
            for (int i = 0; i < k && end != null; i++) {
                end = end.next;
            }
            // 如果不够 k 个，直接结束，剩下的不反转
            if (end == null) break;

            // 2. 记录关键节点
            ListNode start = pre.next;      // 本组的头 (反转后变成尾)
            ListNode nextGroup = end.next;  // 下一组的头

            // 3. 断开链表 (把这一组孤立出来)
            end.next = null;

            // 4. 反转这一组 (调用 helper 函数)
            // pre.next 连接反转后的新头
            pre.next = reverse(start);

            // 5. 连接下一组
            // start 变成了这一组的尾巴，连接 nextGroup
            start.next = nextGroup;

            // 6. 重置指针，准备下一轮
            pre = start; // pre 走到当前组的尾巴
            end = pre;   // end 回到 pre 的位置，重新开始数
        }

        return dummy.next;
    }

    // 标准的 LC206 反转链表
    private ListNode reverse(ListNode head) {
        ListNode pre = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        return pre; // 返回新的头节点
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
