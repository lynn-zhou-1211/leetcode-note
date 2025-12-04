package src.leetcode.editor.en;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC39_CombinationSum{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> path = new ArrayList<>();
    int sum = 0;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        backtracking(candidates,target,0);
        return res;
    }
    private void backtracking(int[] candidates,int target,int startIndex){
        if(sum==target){
            res.add(new ArrayList<>(path));
            return;
        }
        if(sum>target) return;

        for (int i = startIndex; i <candidates.length ; i++) {
            int val = candidates[i];
            path.add(val);
            sum+=val;

            // 可以重复添加，所以不=1
            backtracking(candidates,target,startIndex);

            sum-=val;
            path.remove(path.size()-1);
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
