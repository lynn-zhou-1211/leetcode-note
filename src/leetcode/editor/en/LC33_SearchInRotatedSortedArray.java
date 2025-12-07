package src.leetcode.editor.en;

public class LC33_SearchInRotatedSortedArray{
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int search(int[] nums, int target) {
            int left = 0;
            int right = nums.length-1;
            while(left<=right){
                int mid = left+(right-left)/2;
                if(nums[mid]==target) return mid;
                // left part is ordered
                if(nums[mid]>=nums[left]){
                    if(target>=nums[left] && nums[mid]>target){
                        right = mid-1;
                    }else{
                        left = mid+1;
                    }
                }else{ // right is ordered
                    if(nums[mid]<target && target <= nums[right]){
                        left = mid+1;
                    }else{
                        right = mid-1;
                    }
                }
            }
            return -1;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
