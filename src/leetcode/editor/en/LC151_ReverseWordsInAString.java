package src.leetcode.editor.en;

import java.util.logging.Level;

public class LC151_ReverseWordsInAString {
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {

        public String reverseWords(String s) {
            StringBuilder sb = new StringBuilder();

            // remove ' '
            int idx = 0;
            while (idx < s.length() && s.charAt(idx) == ' ') {
                idx++;
            }
            // remove middle ' '
            for (; idx < s.length(); idx++) {
                while (idx > 0 && idx < s.length() && s.charAt(idx - 1) == ' ' && s.charAt(idx) == ' ') {
                    idx++;
                }
                if(idx < s.length()) sb.append(s.charAt(idx));
            }
            // remove end ' '
            if (sb.length() != 0 && sb.charAt(sb.length() - 1) == ' ') sb.setLength(sb.length() - 1);

            // reverse
            reverse(sb,0,sb.length()-1);
            int start = 0;
            int end = 0;
            while (end<sb.length()) {
                while (end<sb.length() && sb.charAt(end)!=' ') end++;
                reverse(sb,start,end-1);
                start = end+1;
                end++;
            }
            return sb.toString();
        }

        private void reverse(StringBuilder sb, int start, int end) {
            while (start < end) {
                char c = sb.charAt(start);
                sb.setCharAt(start, sb.charAt(end));
                sb.setCharAt(end, c);
                start++;
                end--;
            }
        }

    }
//leetcode submit region end(Prohibit modification and deletion)

}
