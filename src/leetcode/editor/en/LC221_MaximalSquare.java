package src.leetcode.editor.en;

public class LC221_MaximalSquare {
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int maximalSquare(char[][] matrix) {
            // dp[i][j]:当前下标的最长正方形边长
            int n = matrix.length;
            int m = matrix[0].length;
            int max = 0;
            int[][] dp = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (matrix[i][j] == '0') {
                        dp[i][j] = 0;
                    } else if (i == 0 || j == 0) {
                        dp[i][j] = 1;
                    } else {
                        dp[i][j] = Math.min(Math.min(dp[i - 1][j], dp[i][j - 1]), dp[i - 1][j - 1]) + 1;
                    }
                    max = Math.max(max, dp[i][j]);
                }
            }
            return max * max;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
