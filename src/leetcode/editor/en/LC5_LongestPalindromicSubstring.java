package src.leetcode.editor.en;

public class LC5_LongestPalindromicSubstring{
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String longestPalindrome(String s) {
            int n = s.length();
            int len = 0;
            int left = -1;
            int right = -1;
            boolean[][] dp = new boolean[n][n];
            for (int i = n - 1; i >= 0; i--) {
                for (int j = i; j < n; j++) {
                    if (s.charAt(i) == s.charAt(j)) {
                        // j - i <= 1 处理 'a' 和 'aa' 的情况
                        if (j - i <= 1 || dp[i + 1][j - 1]) {
                            dp[i][j] = true;
                            len = Math.max(len,j-i+1);
                            if(len == j-i+1){
                                left = i;
                                right = j;
                            }
                        }
                    }
                }
            }
            return s.substring(left,right+1);
        }

    }
//leetcode submit region end(Prohibit modification and deletion)

}
