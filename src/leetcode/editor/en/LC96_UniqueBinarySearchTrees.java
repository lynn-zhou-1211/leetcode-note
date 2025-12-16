package src.leetcode.editor.en;

public class LC96_UniqueBinarySearchTrees{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int numTrees(int n) {
        // 选择j作为切分点
        // 根：j
        // 左：j-1
        // 右：i-j
        int[] dp = new int[n+1];
        dp[0]=1;
        dp[1]=1;
        for (int i = 2; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
                dp[i]+=dp[j-1]*dp[i-j];
            }
        }
        return dp[n];
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
