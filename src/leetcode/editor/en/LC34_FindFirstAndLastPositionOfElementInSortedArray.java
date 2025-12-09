package src.leetcode.editor.en;

public class LC34_FindFirstAndLastPositionOfElementInSortedArray {
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] searchRange(int[] nums, int target) {
            // left
            int leftIdx = getLeftIdx(nums, target);
            if (leftIdx == -1) return new int[]{-1, -1};

            // right
            int rightIdx = getRightIdx(nums, target);
            return new int[]{leftIdx, rightIdx};
        }

        private int getRightIdx(int[] nums, int target) {
            int left;
            int right;
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
            return resR;
        }

        private int getLeftIdx(int[] nums, int target) {
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
            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
