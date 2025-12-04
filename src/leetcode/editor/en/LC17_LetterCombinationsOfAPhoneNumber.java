package src.leetcode.editor.en;

import java.util.ArrayList;
import java.util.List;

public class LC17_LetterCombinationsOfAPhoneNumber {
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        String[] MAPPING = new String[]{"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        List<String> res = new ArrayList<>();

        public List<String> letterCombinations(String digits) {
            backtracking(digits,0,new StringBuilder());
            return res;
        }

        private void backtracking(String digits, int index, StringBuilder path) {
            // 结束条件
            if (index == digits.length()) {
                res.add(path.toString());
                return;
            }
            // 获取并遍历选择列表
            // 获取当前的数字，->当前数字对应的一些字母
            int digit = digits.charAt(index)-'0';
            String letters = MAPPING[digit];
            for (char c : letters.toCharArray()) {
                // append
                path.append(c);
                // backtracking
                backtracking(digits,index+1,path);
                // revoke
                path.deleteCharAt(path.length()-1);
            }

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
