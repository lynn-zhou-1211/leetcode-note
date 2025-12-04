package src.leetcode.editor.en;

public class LC45_JumpGameIi{
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int jump(int[] nums) {
            int jumps = 0, currentEnd = 0, farthest = 0;

            // Don't include the last element; we are jumping TO it
            for (int i = 0; i < nums.length - 1; i++) {
                farthest = Math.max(farthest, i + nums[i]);

                if (i == currentEnd) {
                    jumps++;
                    currentEnd = farthest;
                }
            }
            return jumps;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
