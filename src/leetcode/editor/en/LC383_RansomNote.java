package src.leetcode.editor.en;

public class LC383_RansomNote{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        // record frewuency
        int[] record = new int[26];
        for (char c : magazine.toCharArray()) {
            record[c-'a']++;
        }
        for(char c:ransomNote.toCharArray()){
            record[c-'a']--;
            if(record[c-'a']<0) return false;
        }
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
