package src.leetcode.editor.en;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public class LC15_ThreeSum {
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<List<Integer>> threeSum(int[] nums) {
            // fix one element, use two pointer
            int n = nums.length;
            Arrays.sort(nums);
            List<List<Integer>> res = new ArrayList<>();
            for (int i = 0; i < n - 2 ; i++) {
                if(nums[i]>0) break;
                // 外层去重
                if(i>0 && nums[i]==nums[i-1]) continue;
                int left = i + 1;
                int right = n - 1;
                while (left < right) {
                    int sum = nums[i] + nums[left] + nums[right];
                    if (sum == 0) {
                        res.add(Arrays.asList(nums[i],nums[left],nums[right]));
                        // 内循环去重 && 移动指针
                        while(left<right && nums[left]==nums[left+1]) left++;
                        while(left<right && nums[right]==nums[right-1]) right--;
                        left++;
                        right--;
                    } else if (sum > 0) right--;
                    else left++;
                }
            }
            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
