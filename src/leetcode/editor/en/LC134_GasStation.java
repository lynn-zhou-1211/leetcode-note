package src.leetcode.editor.en;

public class LC134_GasStation{
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int canCompleteCircuit(int[] gas, int[] cost) {
            int totalTank = 0;
            int currTank = 0;
            int startStation = 0;

            for (int i = 0; i < gas.length; i++) {
                int netCost = gas[i] - cost[i];
                totalTank += netCost;
                currTank += netCost;

                // If we can't reach current i from startStation
                if (currTank < 0) {
                    startStation = i + 1;
                    currTank = 0;
                }
            }
            return totalTank >= 0 ? startStation : -1;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
