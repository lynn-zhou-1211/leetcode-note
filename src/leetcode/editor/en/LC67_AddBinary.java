package src.leetcode.editor.en;

public class LC67_AddBinary {
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String addBinary(String a, String b) {
            int carry = 0;
            int i = a.length() - 1;
            int j = b.length() - 1;

            StringBuilder ans = new StringBuilder();
            while (i >= 0 || j >= 0 || carry!=0){
                int x = i >= 0 ? a.charAt(i)-'0' : 0;
                int y = j >= 0 ? b.charAt(j)-'0' : 0;
                int sum = x + y + carry;

                carry = sum / 2;
                ans.append(sum % 2);
                i--;
                j--;
            }
            return ans.reverse().toString();

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
