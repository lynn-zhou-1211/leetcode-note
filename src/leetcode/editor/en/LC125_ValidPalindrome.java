package src.leetcode.editor.en;

import javax.security.auth.callback.CallbackHandler;

public class LC125_ValidPalindrome{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isPalindrome(String s) {
        // two pointer: 1.not letter:' 'jump    2.upper->lower
        int left = 0, right = s.length()-1;
        while (left<right){
            char cl = s.charAt(left);
            char cr = s.charAt(right);
            if(!Character.isLetterOrDigit(cl)){
                left++;
                continue;
            }
            if(!Character.isLetterOrDigit(cr)){
                right--;
                continue;
            }
            if(Character.toLowerCase(cl)!= Character.toLowerCase(cr)) return false;
            left++;
            right--;
        }
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
