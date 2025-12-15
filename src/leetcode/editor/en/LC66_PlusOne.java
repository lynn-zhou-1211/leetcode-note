package src.leetcode.editor.en;

public class LC66_PlusOne{
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] plusOne(int[] digits) {
            int n = digits.length;

            // 1. 从后往前遍历
            for (int i = n - 1; i >= 0; i--) {
                // 如果当前位不是 9，直接加 1 返回
                if (digits[i] != 9) {
                    digits[i]++;
                    return digits; // 任务完成，直接结束
                }

                // 如果是 9，变成 0，继续循环处理前一位
                digits[i] = 0;
            }

            // 2. 代码走到这里说明数组里全是 0 (原数组全是 9)
            int[] newDigits = new int[n + 1];
            newDigits[0] = 1; // 首位设为 1，Java 默认后续全是 0

            return newDigits;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
