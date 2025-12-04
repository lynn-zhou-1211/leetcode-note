package src.leetcode.editor.en;

public class LC80_RemoveDuplicatesFromSortedArrayIi{
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int removeDuplicates(int[] nums) {
            int i = 0;
            for (int n : nums) {
                // Allow if index < 2 OR current num > num at position i-2
                if (i < 2 || n > nums[i - 2]) {
                    nums[i++] = n;
                }
            }
            return i;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
