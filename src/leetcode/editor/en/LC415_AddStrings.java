package src.leetcode.editor.en;

public class LC415_AddStrings{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String addStrings(String num1, String num2) {
        int i = num1.length()-1;
        int j = num2.length()-1;
        int carry = 0;

        StringBuilder ans = new StringBuilder();
        // 从后往前遍历
        while(i>=0 || j >=0 || carry!=0){
            // 取最后一个数，相加
            int digit1 = i>=0?num1.charAt(i)-'0':0;
            int digit2 = j>=0?num2.charAt(j)-'0':0;

            int sum = digit1+digit2+carry;

            carry = sum/10;
            ans.append(sum%10);

            i--;
            j--;
        }
        return ans.reverse().toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
