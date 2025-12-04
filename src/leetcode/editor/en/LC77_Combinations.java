package src.leetcode.editor.en;

import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;
import java.util.ArrayList;
import java.util.List;

public class LC77_Combinations{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        backtracking(n,k,1,new ArrayList());
        return res;
    }
    private void backtracking(int n, int k, int startIndex,List<Integer> path){
        if(path.size()==k){
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = startIndex; i <=n; i++) {
            path.add(i);
            backtracking(n,k,i+1,path);
            path.remove(path.size()-1);
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
