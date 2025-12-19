package src.leetcode.editor.en;

import java.util.Arrays;

public class LC392_IsSubsequence{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isSubsequence(String s, String t) {
        // s的前i个，是否可以通过对 t的前j个 删除一些元素得到
        // 当s[i]==t[j]，如果都s[i-1]==t[j-1]是，现在也是
        //        双指针：两个元素一起往前走
        // 当s[i]!=t[j]，如果j-1是，现在也是
        //        双指针：s不动，t的指针往前走

        int n = s.length();
        int m = t.length();
        boolean[][] dp = new boolean[n+1][m+1];
        Arrays.fill(dp[0],true);

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if(s.charAt(i-1)==t.charAt(j-1)) dp[i][j]=dp[i-1][j-1];
                else dp[i][j]=dp[i][j-1];
            }
        }
        return dp[n][m];
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
