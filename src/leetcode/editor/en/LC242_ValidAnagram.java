package src.leetcode.editor.en;

import java.util.HashMap;
import java.util.Map;

public class LC242_ValidAnagram{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;

        Map<Character,Integer> record = new HashMap<>();
        for (char c : s.toCharArray()) {
            record.put(c,record.getOrDefault(c,0)+1);
        }
        for (char c : t.toCharArray()) {
            if(!record.containsKey(c)) return false;
            record.put(c,record.get(c)-1);
            if(record.get(c) <0) return false;
        }

        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
