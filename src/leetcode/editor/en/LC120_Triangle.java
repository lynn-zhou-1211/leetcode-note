package src.leetcode.editor.en;

import java.util.List;
import java.util.SimpleTimeZone;

public class LC120_Triangle {
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int minimumTotal(List<List<Integer>> triangle) {
            // 0
            // 0  1
            // 0  1  2
            // 二维数组：dp[i,j]: 当前位置的最大path
            // dp[i,j]=min{dp[i-1,j-1],dp[i-1,j}+triangle[i,j]
            // 第一行和最后一行要特殊处理
//            int n = triangle.size();
//            int m = triangle.get(n - 1).size();
//            int[][] dp = new int[n][m];
//            dp[0][0] = triangle.get(0).get(0);
//            int min = Integer.MAX_VALUE;
//            // 特殊处理 n=1
//            if (n == 1) return dp[0][0];
//            for (int i = 1; i < n; i++) {
//                for (int j = 0; j <= i; j++) {
//                    if (j == 0) dp[i][j] = dp[i - 1][j] + triangle.get(i).get(j);
//                    else if (j == i) dp[i][j] = dp[i - 1][j - 1] + triangle.get(i).get(j);
//                    else dp[i][j] = Math.min(dp[i - 1][j], dp[i - 1][j - 1]) + triangle.get(i).get(j);
//
//                    if (i == n - 1) {
//                        if (j == 0) min = dp[i][j];
//                        min = Math.min(min, dp[i][j]);
//                    }
//                }
//            }
//            return min;

            // 从下往上：不需要特殊处理第一列和最后一列；dp[0][0]就是答案

            int n = triangle.size();
            int m = triangle.get(n - 1).size();

            int[][] dp = new int[n][m];
            for (int j = 0; j < m; j++) {
                dp[n - 1][j] = triangle.get(n - 1).get(j);
            }
            for (int i = n - 2; i >= 0; i--) {
                for (int j = 0; j <= i; j++) {
                    dp[i][j] = Math.min(dp[i][j], dp[i][j + 1]) + triangle.get(i).get(j);
                }
            }
            return dp[0][0];
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
