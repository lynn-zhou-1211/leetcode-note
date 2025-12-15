package src.leetcode.editor.en;

public class LC63_UniquePathsIi {
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int uniquePathsWithObstacles(int[][] obstacleGrid) {
            // dp[i][j]：可达路径数量，如果是障碍物，就为0；否则=上方+左方
            int n = obstacleGrid.length;
            int m = obstacleGrid[0].length;
            int[][] dp = new int[n][m];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (obstacleGrid[i][j] == 1) dp[i][j] = 0;
                    else if (i == 0 && j == 0) dp[i][j] = 1;
                    else if (i == 0) dp[i][j] = dp[i][j - 1];
                    else if (j == 0) dp[i][j] = dp[i - 1][j];
                    else dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                }
            }
            return dp[n - 1][m - 1];
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
