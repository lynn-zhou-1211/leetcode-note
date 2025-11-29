package src.leetcode.editor.en;

import java.util.ArrayList;
import java.util.List;

public class LC228_SummaryRanges{
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<String> summaryRanges(int[] nums) {
            List<String> res = new ArrayList<>();
            if(nums.length == 0) return res;
            int i =0;
            while(i<nums.length){
                int start = nums[i];
                int j = i;
                // expend
                while(j+1<nums.length && nums[j+1]==nums[j]+1){
                    j++;
                }
                // format
                if(nums[j] == start){
                    res.add(start+"");
                }else{
                    res.add(start +"->"+nums[j]);
                }
                // move
                i=j+1;
            }
            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
