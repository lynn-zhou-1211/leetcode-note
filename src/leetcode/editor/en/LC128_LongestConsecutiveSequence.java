package src.leetcode.editor.en;

import java.lang.foreign.MemorySegment;
import java.util.*;

public class LC128_LongestConsecutiveSequence{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        Set<Integer> set = new HashSet<>();
        for (int num:nums) {
            set.add(num);
        }
        // 找头
        List<Integer> list = new ArrayList<>();
        for (Integer num : set) {
            if(!set.contains(num-1)) list.add(num);
        }

        // 遍历头
        int length = 1;
        int maxLength = 1;
        for (Integer num : list) {
            int cur = num;
            length = 1;
            while (set.contains(cur+1)) {
                length++;
                cur++;
            }
            maxLength=Math.max(maxLength,length);
        }
        return maxLength;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
