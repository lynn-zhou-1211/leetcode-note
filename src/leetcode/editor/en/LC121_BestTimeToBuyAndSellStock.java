package src.leetcode.editor.en;

public class LC121_BestTimeToBuyAndSellStock{
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int maxProfit(int[] prices) {
            int minPrice = Integer.MAX_VALUE;
            int maxProfit = 0;

            for (int price : prices) {
                if (price < minPrice) {
                    minPrice = price;
                } else if (price - minPrice > maxProfit) {
                    maxProfit = price - minPrice;
                }
            }
            return maxProfit;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
