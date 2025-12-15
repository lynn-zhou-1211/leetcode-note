package src.leetcode.editor.en;

public class LC190_ReverseBits{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int reverseBits(int n) {
        int ans = 0;
        for (int i = 0; i < 32; i++) {
            ans <<= 1;
            ans = ans|(n&1);
            n >>>= 1;
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
