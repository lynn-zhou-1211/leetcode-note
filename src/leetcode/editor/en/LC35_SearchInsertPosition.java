package src.leetcode.editor.en;

public class LC35_SearchInsertPosition{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        while (left<=right){
            int mid = left+(right-left)/2;
            if(nums[mid]==target)return mid;
            if(nums[mid]>target){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return left;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
