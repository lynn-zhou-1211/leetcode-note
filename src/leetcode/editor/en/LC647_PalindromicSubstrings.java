package src.leetcode.editor.en;

public class LC647_PalindromicSubstrings {
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int countSubstrings(String s) {

            // 中心扩散
//        int n = s.length();
//        int count = 0;
//        for (int i = 0; i < n; i++) {
//            // 单字符
//            int left = i;
//            int right = i;
//            while (left>=0 && right<n && s.charAt(left)==s.charAt(right)) {
//                count++;
//                left--;
//                right++;
//            }
//            // 双字符
//            if(i<n-1 && s.charAt(i)==s.charAt(i+1)){
//                left=i;
//                right=i+1;
//                while (left>=0 && right<n && s.charAt(left)==s.charAt(right)) {
//                    count++;
//                    left--;
//                    right++;
//                }
//            }
//
//        }
//        return count;

            // DP：dp[i][j]是否是回文串，需要知道dp[i+1][j-1] 是否是
            int n = s.length();
            int count = 0;
            boolean[][] dp = new boolean[n][n];
            for (int i = n - 1; i >= 0; i--) {
                for (int j = i; j < n; j++) {
                    if (s.charAt(i) == s.charAt(j)) {
                        // j - i <= 1 处理 'a' 和 'aa' 的情况
                        if (j - i <= 1 || dp[i + 1][j - 1]) {
                            dp[i][j] = true;
                            count++;
                        }
                    }
                }
            }
            return count;

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
