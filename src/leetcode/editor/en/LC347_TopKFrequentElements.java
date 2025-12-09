package src.leetcode.editor.en;

import java.beans.Introspector;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class LC347_TopKFrequentElements{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : nums) {
             freq.put(num,freq.getOrDefault(num,0)+1);
        }
        PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>((a,b)->a.getValue()-b.getValue());
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            pq.offer(entry);
            if(pq.size()>k){
                pq.poll();
            }
        }
        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i] = pq.poll().getKey();
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
