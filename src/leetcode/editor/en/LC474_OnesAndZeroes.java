package src.leetcode.editor.en;

public class LC474_OnesAndZeroes {
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int findMaxForm(String[] strs, int m, int n) {
            int[][] dp = new int[m+1][n+1];
            dp[0][0] = 0;

            for (String str : strs) {
                int n0 = countZeros(str);
                int n1 = str.length() - n0;
                for (int i = m; i >= 0; i--) {
                    for (int j = n; j >= 0; j--) {
                        if (i >= n0 && j >= n1) dp[i][j] = Math.max(dp[i][j], 1+dp[i - n0][j - n1]);
                    }
                }
            }
            return dp[m][n];
        }

        private int countZeros(String str) {
            int count = 0;
            for (char c : str.toCharArray()) {
                if (c == '0') count++;
            }
            return count;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
