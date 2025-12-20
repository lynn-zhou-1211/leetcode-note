package src.leetcode.editor.en;

public class LC97_InterleavingString {
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean isInterleave(String s1, String s2, String s3) {
            //s1[i] & s2[j] -> s3[i+j] i,j表示前i,j个元素
            int n = s1.length();
            int m = s2.length();
            if (n + m != s3.length()) return false;
            boolean[][] dp = new boolean[n + 1][m + 1];
            dp[0][0] = true;

            boolean fromUp;
            boolean fromLeft = false;
            for (int i = 0; i <= n; i++) {
                for (int j = 0; j <= m; j++) {
                    if (i == 0 & j == 0) continue;
                    fromUp = i > 0 && s1.charAt(i - 1) == s3.charAt(i + j - 1) && dp[i - 1][j];
                    fromLeft = j > 0 && s2.charAt(j - 1) == s3.charAt(i + j - 1) && dp[i][j - 1];
                    dp[i][j] = fromUp || fromLeft;
                }
            }
            return dp[n][m];
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
