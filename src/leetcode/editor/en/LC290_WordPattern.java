package src.leetcode.editor.en;

import java.util.HashMap;
import java.util.Map;

public class LC290_WordPattern{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] strings = s.split(" ");
        Map<Character,String> mapP = new HashMap<>();
        Map<String,Character> mapS = new HashMap<>();
        if(pattern.length()!= strings.length) return false;
        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String str = strings[i];
            if(mapP.containsKey(c) && !mapP.get(c).equals(str)) return false;
            if(mapS.containsKey(str) && mapS.get(str)!=c) return false;
            mapP.put(c,str);
            mapS.put(str,c);
        }
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
