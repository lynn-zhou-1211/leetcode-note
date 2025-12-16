package src.leetcode.editor.en;

import java.util.Arrays;
import java.util.MissingFormatArgumentException;

public class LC279_PerfectSquares{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int numSquares(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[1]=1;
        for (int i = 2; i <=n; i++) {
            if(isSquare(i)) {
                dp[i]=1;
                continue;
            }
            for (int j = 1; j <=i/2; j++) {
                dp[i]= Math.min(dp[i],dp[j]+dp[i-j]);
            }
        }
        return dp[n];
    }
    private boolean isSquare(int n){
        return Math.sqrt(n)%1==0;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
