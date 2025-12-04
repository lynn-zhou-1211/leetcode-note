package src.leetcode.editor.en;

public class LC122_BestTimeToBuyAndSellStockIi {
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int maxProfit(int[] prices) {
            int maxProfit = 0;
            for (int i = 1; i < prices.length; i++) {
                if (prices[i] > prices[i - 1]) {
                    maxProfit += prices[i] - prices[i - 1];
                }
            }
            return maxProfit;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
