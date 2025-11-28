package src.leetcode.editor.en;

import java.util.HashMap;
import java.util.Map;

public class LC205_IsomorphicStrings{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    // 相同字符串的下标
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()) return false;
        Map<Character,Character> mapS = new HashMap<>();
        Map<Character,Character> mapT = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);
            if(mapS.containsKey(charS) && mapS.get(charS)!=charT) return false;
            if(mapT.containsKey(charT) && mapT.get(charT)!=charS) return false;
            mapS.put(charS,charT);
            mapT.put(charT,charS);
        }
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
