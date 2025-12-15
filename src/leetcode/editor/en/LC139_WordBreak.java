package src.leetcode.editor.en;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LC139_WordBreak{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        // dp[i]数组中有i个元素，0～i-1，
        // dp[i]==true: dp[j]==true && [j,i-1]在list中
        int n = s.length();
        Set<String> set = new HashSet<>(wordDict);
        boolean[] dp = new boolean[n+1];
        dp[0]=true;
        for (int i = 1; i <= n; i++) {
            for (int j = i-1; j >=0; j--) {
                if(dp[j] && set.contains(s.substring(j,i))) dp[i]=true;
            }
        }
        return dp[n];
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
