package src.leetcode.editor.en;

public class LC201_BitwiseAndOfNumbersRange {
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int rangeBitwiseAnd(int left, int right) {
            // 找相同前缀
            int move = 0;
            while (left != right) {
                left >>>= 1;
                right >>>= 1;
                move++;
            }
            return left << move;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
