package src.leetcode.editor.en;

import java.util.PriorityQueue;

public class LC215_KthLargestElementInAnArray{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int num :nums){
            pq.offer(num);
            if(pq.size()>k){
                pq.poll(); // 小顶堆，弹出上面最小的
            }
        }
        return pq.peek();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
