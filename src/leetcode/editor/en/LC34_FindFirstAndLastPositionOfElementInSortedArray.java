package src.leetcode.editor.en;

public class LC34_FindFirstAndLastPositionOfElementInSortedArray {
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] searchRange(int[] nums, int target) {
            // left
            int left = 0;
            int right = nums.length - 1;
            int res = -1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (target == nums[mid]) {
                    res = mid;
                    right = mid - 1;
                } else if (target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            if (res == -1) return new int[]{-1, -1};

            // right
            left = 0;
            right = nums.length - 1;
            int resR = -1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (target == nums[mid]) {
                    resR = mid;
                    left = mid + 1;
                } else if (target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            return new int[]{res, resR};
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
