package src.leetcode.editor.en;

public class LC172_FactorialTrailingZeroes{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int trailingZeroes(int n) {
        // 寻找有几个5
        int count = 0;
        while (n>0){
            n/=5;
            count+=n;
        }
        return count;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
