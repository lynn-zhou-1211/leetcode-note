package src.leetcode.editor.en;

import java.util.HashSet;
import java.util.IllegalFormatWidthException;
import java.util.Set;

public class LC3_LongestSubstringWithoutRepeatingCharacters{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right =0;
        int maxLen=0;
        Set<Character> window = new HashSet<>();

        while (right<s.length()){
            char c = s.charAt(right);

            while (window.contains(c)){
                window.remove(s.charAt(left));
                left++;
            }

            window.add(c);

            maxLen = Math.max(maxLen,right-left+1);
            right++;
        }
        return maxLen;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
