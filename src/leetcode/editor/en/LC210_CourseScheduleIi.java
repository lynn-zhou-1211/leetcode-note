package src.leetcode.editor.en;

import java.util.*;

public class LC210_CourseScheduleIi {
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] findOrder(int numCourses, int[][] prerequisites) {
            // 1. 初始化邻接表和入度数组
            List<List<Integer>> graph = new ArrayList<>();
            for (int i = 0; i < numCourses; i++) {
                graph.add(new ArrayList<>());
            }
            int[] inDegree = new int[numCourses];

            // 2. 建图并计算入度
            for (int i = 0; i < prerequisites.length; i++) {
                // u <- v
                int u = prerequisites[i][0];
                int v = prerequisites[i][1];
                graph.get(v).add(u);
                inDegree[u]++;
            }
            // 3. 将所有入度为 0 的节点加入队列
            Queue<Integer> q = new ArrayDeque<>();
            for (int i = 0; i < numCourses; i++) {
                if(inDegree[i]==0) q.offer(i);
            }

            // 4. BFS 处理
            int[] order = new int[numCourses];
            int idx=0;
            while (!q.isEmpty()){
                int cur = q.poll();
                order[idx++]=cur;
                for (Integer neighbor : graph.get(cur)) {
                    inDegree[neighbor]--;
                    if(inDegree[neighbor]==0){
//                        order[idx]=neighbor;
//                        idx++;
                        q.offer(neighbor);
                    }
                }
            }
            if (idx != numCourses) {
                return new int[0];
            }

            return order;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
