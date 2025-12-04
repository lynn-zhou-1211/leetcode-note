package src.leetcode.editor.en;

import java.util.HashMap;
import java.util.Map;

public class LC13_RomanToInteger{
    //leetcode submit region begin(Prohibit modification and deletion)

    class Solution {
        public int romanToInt(String s) {
            Map<Character, Integer> values = new HashMap<>();
            values.put('I', 1); values.put('V', 5); values.put('X', 10);
            values.put('L', 50); values.put('C', 100); values.put('D', 500);
            values.put('M', 1000);

            int total = 0;
            for (int i = 0; i < s.length(); i++) {
                int current = values.get(s.charAt(i));
                int next = (i + 1 < s.length()) ? values.get(s.charAt(i + 1)) : 0;

                // Subtraction case (e.g., IV, IX)
                if (current < next) {
                    total -= current;
                } else {
                    total += current;
                }
            }
            return total;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
