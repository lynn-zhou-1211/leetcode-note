package src.leetcode.editor.en;

public class LC1049_LastStoneWeightIi{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int lastStoneWeightII(int[] stones) {
        // 尽可能均匀地将数字分成两组
        // 背包：target
        // weight：stones[i]
        // value：stones[i]
        // return (dp[target]-target)*2  取上界

        int sum = 0;
        for (int stone : stones) sum+=stone;
        int target = (sum+1)/2;

        int[] dp = new int[target+1];
        dp[0] =0;

        for (int stone : stones) {
            for (int j = target; j >=0 ; j--) {
                if(j>=stone) dp[j]=Math.max(dp[j],dp[j-stone]+stone);
            }
        }
        return Math.abs(dp[target]*2-sum);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
