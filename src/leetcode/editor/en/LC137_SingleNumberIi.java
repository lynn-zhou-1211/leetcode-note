package src.leetcode.editor.en;

public class LC137_SingleNumberIi{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int singleNumber(int[] nums) {
        int ans = 0;
        // 位相加，如果%3==1，说明出现一次的数字当前位不是0；
        // 左移： <<i
        // 右移： >>>i
        // 取各位： &1
        for (int i = 0; i < 32; i++) {
            int sum=0;
            for (int num : nums) {
                sum+=(num>>>i)&1;
            }
            ans|=(sum%3)<<i;
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
