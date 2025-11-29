package src.leetcode.editor.en;

import java.util.ArrayDeque;
import java.util.Deque;

public class LC71_SimplifyPath{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String simplifyPath(String path) {
        String[] dirs = path.split("/");
        Deque<String> stack = new ArrayDeque<>();
        for (String dir : dirs) {
            if(dir.isEmpty() || dir.equals(".")) continue;
            if(dir.equals("..")) stack.pollLast();
            else stack.offerLast(dir);
        }
        return "/" + String.join("/",stack);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
