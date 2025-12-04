package src.leetcode.editor.en;

public class LC274_HIndex{
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int hIndex(int[] citations) {
            int n = citations.length;
            // Buckets store the count of papers with 'i' or more citations
            int[] buckets = new int[n + 1];

            // Fill buckets
            for (int c : citations) {
                if (c >= n) {
                    buckets[n]++;
                } else {
                    buckets[c]++;
                }
            }

            int count = 0;
            // Check from largest possible H-index (n) down to 0
            for (int i = n; i >= 0; i--) {
                count += buckets[i];
                // If we have 'i' papers with at least 'i' citations
                if (count >= i) {
                    return i;
                }
            }
            return 0;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
