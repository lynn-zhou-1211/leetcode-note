package src.leetcode.editor.en;

public class LC97_InterleavingString {
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean isInterleave(String s1, String s2, String s3) {
            int n = s1.length(), m = s2.length();
            if (n + m != s3.length()) return false;

            boolean[] dp = new boolean[m + 1];
            dp[0] = true; // 对应二维的 dp[0][0]

            for (int i = 0; i <= n; i++) {
                for (int j = 0; j <= m; j++) {
                    int p = i + j - 1;

                    if (i == 0 && j == 0) continue;

                    // 这里的 dp[j] 在赋值前代表“上一行”的值 (fromUp)
                    // 赋值后代表“当前行”的值

                    // 1. 判断是否能从上方(s1)下来
                    // 如果 i==0，显然不能从上方下来，设为 false
                    // 否则，看上一行的 dp[j] 是否为 true 且字符匹配
                    boolean fromUp = (i > 0) && dp[j] && (s1.charAt(i - 1) == s3.charAt(p));

                    // 2. 判断是否能从左方(s2)过来
                    // 如果 j==0，显然不能从左方过来，设为 false
                    // 否则，看当前行刚刚算出来的 dp[j-1] 是否为 true 且字符匹配
                    boolean fromLeft = (j > 0) && dp[j - 1] && (s2.charAt(j - 1) == s3.charAt(p));

                    dp[j] = fromUp || fromLeft;
                }
            }
            return dp[m];
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
