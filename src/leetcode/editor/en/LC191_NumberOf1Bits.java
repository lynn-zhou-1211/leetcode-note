package src.leetcode.editor.en;

public class LC191_NumberOf1Bits{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int hammingWeight(int n) {
        int count = 0;
        while (n!=0){
            n=n&(n-1);
            count++;
        }
        return count;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
