package src.leetcode.editor.en;

public class LC11_ContainerWithMostWater{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int maxArea = 0;
        while(left <right){
            int currentArea = (right-left)*Math.min(height[left],height[right]);
            maxArea = Math.max(maxArea,currentArea);
            if(height[left]>height[right]) {
                right--;
            }else if(height[left]<height[right]){
                left++;
            }else{
                left++;
                right--;
            }
        }
        return maxArea;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
