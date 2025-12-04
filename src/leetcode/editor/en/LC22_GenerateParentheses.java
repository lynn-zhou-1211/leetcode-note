package src.leetcode.editor.en;

import java.util.ArrayList;
import java.util.List;

public class LC22_GenerateParentheses{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    List<String> ans= new ArrayList<>();
    StringBuilder path = new StringBuilder();
    public List<String> generateParenthesis(int n) {
        // path中的左<n; 左>=右
        backtracking(n,0,0);
        return ans;
    }
    private void backtracking(int n, int left, int right){
        // 不要在 Base Case 里一次性补全右括号，而是让递归自然地处理每一个右括号。
        // 这样逻辑最清晰，且每一步都有对应的 deleteCharAt 回溯。
        // 如果要补全，需要在return之前撤销，否则会污染path
//        if(left==n){
//            for (int i = 0; i < n-right; i++) {
//                path.append(")");
//            }
//            ans.add(path.toString());
//            return;
//        }
        if(left==n && right==n){
            ans.add(path.toString());
            return;
        }

        // 遍历：(,)
        // 左
        if(left<n){
            path.append("(");
            backtracking(n,left+1,right);
            path.deleteCharAt(path.length()-1);
        }

        // 右
        if(left>right){
            path.append(")");
            backtracking(n,left,right+1);
            path.deleteCharAt(path.length()-1);
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
