package src.leetcode.editor.en;

public class LC136_SingleNumber{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int singleNumber(int[] nums) {
        int ans = 0;
        for (int num : nums) {
            ans^=num;
        }
        return  ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
