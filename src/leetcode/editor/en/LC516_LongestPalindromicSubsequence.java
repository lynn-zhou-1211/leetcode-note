package src.leetcode.editor.en;

public class LC516_LongestPalindromicSubsequence {
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int longestPalindromeSubseq(String s) {
            // dp[i][j]: i~j 最长回文串的长度
            int n = s.length();
            int[][] dp = new int[n][n];
            for (int i = n - 1; i >= 0; i--) {
                for (int j = i; j < n; j++) {
                    if(s.charAt(i)==s.charAt(j)){
                        if(j-i<=1) dp[i][j]=j-i+1;
                        else dp[i][j]=dp[i+1][j-1]+2;
                    }
                    else{
                        dp[i][j]=Math.max(dp[i+1][j],dp[i][j-1]);
                    }
                }
            }
            return dp[0][n-1];
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
