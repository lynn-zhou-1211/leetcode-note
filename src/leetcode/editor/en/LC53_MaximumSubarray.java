package src.leetcode.editor.en;

public class LC53_MaximumSubarray{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxSubArray(int[] nums) {
//        int sum =nums[0];
//        int max = nums[0];
//        for (int i = 1; i < nums.length; i++) {
//            sum+=nums[i];
//            sum=Math.max(sum,nums[i]);
//            max=Math.max(sum,max);
//        }
//        return max;

        // divide and conquer
        return helper(nums,0,nums.length-1);
    }
    private int helper(int[] nums, int left, int right){
        // base case
        if(left==right){
            return nums[left];
        }
        // 递归求两边最大值
        int mid = left+(right-left)/2;
        int leftMax = helper(nums,left,mid);
        int rightMax = helper(nums,mid+1,right);
        int crossMax = getCrossSum(nums,left,right,mid);
        return Math.max(crossMax,Math.max(leftMax,rightMax));
    }
    private int getCrossSum(int[] nums, int left, int right,int mid){
        int sum = 0;
        int leftPartMax = Integer.MIN_VALUE;
        for (int i = mid; i >=left ; i--) {
            sum+=nums[i];
            leftPartMax = Math.max(sum,leftPartMax);
        }
        sum = 0;
        int rightSumMax =Integer.MIN_VALUE;
        for (int i = mid+1; i <=right; i++) {
            sum+=nums[i];
            rightSumMax = Math.max(sum,rightSumMax);
        }
        return leftPartMax+rightSumMax;

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
