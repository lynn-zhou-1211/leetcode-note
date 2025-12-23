package src.leetcode.editor.en;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class LC207_CourseSchedule{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }
        int[] inDegree = new int[numCourses];

        for (int[] pair: prerequisites) {
            int curr=pair[0];
            int pre = pair[1];
            inDegree[curr]++;
            adj.get(pre).add(curr);
        }

        Deque<Integer> q = new ArrayDeque<>();
        for (int i = 0; i < numCourses; i++) {
            if(inDegree[i]==0){
                q.push(i);
            }
        }
        
        int count =0;
        while (!q.isEmpty()){
            int course = q.poll();
            count++;
            for (Integer next : adj.get(course)) {
                inDegree[next]--;
                if(inDegree[next]==0){
                    q.offer(next);
                }
            }
        }

        return count==numCourses;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
