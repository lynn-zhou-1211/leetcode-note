package src.leetcode.editor.en;

public class LC115_DistinctSubsequences {
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int numDistinct(String s, String t) {
            // 删除【s的前i个】得到【t的前j个】
            // 当s[i]!=t[j]，s[i]无用，使用s[i-1]及之前的匹配t[j]
            // 当s[i]==t[j]，可以选择是否使用s[i]
            //     不使用：同上
            //       使用：s和t都回退
            int n = s.length();
            int m = t.length();
            int[][] dp = new int[n + 1][m + 1];
            for (int i = 0; i <= n; i++) {
                dp[i][0] = 1;
            }
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= m; j++) {
                    if (s.charAt(i - 1) == t.charAt(j - 1))
                        dp[i][j] = dp[i - 1][j] + dp[i - 1][j - 1];
                    else dp[i][j] = dp[i - 1][j];
                }
            }
            return dp[n][m];
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
