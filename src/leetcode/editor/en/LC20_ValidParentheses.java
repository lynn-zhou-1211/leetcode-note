package src.leetcode.editor.en;

import java.util.*;

public class LC20_ValidParentheses{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {

    public boolean isValid(String s) {
        Map<Character,Character> pairs = new HashMap<>();
        pairs.put(')','(');
        pairs.put(']','[');
        pairs.put('}','{');
        Set<Character> set = new HashSet<>();
        set.add('(');
        set.add('[');
        set.add('{');
        Deque<Character> stack = new ArrayDeque<>();
        for (char c : s.toCharArray()) {
            if(set.contains(c)){
                stack.push(c);
            }else{
                if(stack.isEmpty() || pairs.get(c) != stack.pop()) return false;
            }
        }
        return stack.isEmpty();

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
