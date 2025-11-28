package src.leetcode.editor.en;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class LC219_ContainsDuplicateIi{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // map：数字，最新的下标
        Map<Integer,Integer> lastIndices= new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int cur = nums[i];
            if(lastIndices.containsKey(cur) && i-lastIndices.get(cur)<=k) return true;
            lastIndices.put(cur,i);
        }

        return false;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
