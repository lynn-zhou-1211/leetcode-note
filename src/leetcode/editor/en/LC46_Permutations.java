package src.leetcode.editor.en;

import java.util.ArrayList;
import java.util.List;

public class LC46_Permutations{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
        List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        backtracking(nums,0,new ArrayList<>());
        return res;
    }
    private void backtracking(int[] nums,int index, List<Integer> path){
        if(path.size()==nums.length){
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if(path.contains(nums[i])) continue;
            path.add(nums[i]);
            backtracking(nums,index+1,path);
            path.remove(path.size()-1);
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
