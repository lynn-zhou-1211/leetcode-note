package src.leetcode.editor.en;

import java.util.ArrayList;
import java.util.List;

public class LC802_FindEventualSafeStates{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        List<Integer> ans = new ArrayList<>();
        int[] color = new int[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if(isSafe(graph,color,i)){
                ans.add(i);
            }
        }
        return ans;
    }
    // 当前节点是否安全：如果有一个邻居是不安全的，当前节点也不安全
        private boolean isSafe(int[][] graph,int[] color, int node){
            // 判断当前节点状态
            if(color[node]==1){
                return false;
            }
            if(color[node]==2){
                return true;
            }
            // 标记为不安全
            color[node]=1;
            // 遍历邻居
            for (int neighbor : graph[node]) {
                if(isSafe(graph,color,neighbor)==false){
                    return false;
                }
            }
            // 标记为安全
            color[node]=2;
            return true;
        }
}
//leetcode submit region end(Prohibit modification and deletion)

}
