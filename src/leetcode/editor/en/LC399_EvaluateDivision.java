package src.leetcode.editor.en;

import java.util.*;

public class LC399_EvaluateDivision {
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
            // a/c = a/b * b/c
            // 1. 建图：Map<StartNode, Map<EndNode, Weight>>
            // 添加正向边和反向边
            Map<String, Map<String, Double>> graph = new HashMap<>();
            for (int i = 0; i < equations.size(); i++) {
                String u = equations.get(i).get(0);
                String v = equations.get(i).get(1);
                double val = values[i];

                graph.putIfAbsent(u, new HashMap<>());
                graph.get(u).put(v, val);

                graph.putIfAbsent(v, new HashMap<>());
                graph.get(v).put(u, 1 / val);
            }

            // 2. 处理每个Query
            // 边界情况: 如果有任何一个变量不再图中，直接返回 -1.0
            double[] res = new double[queries.size()];
            for (int i = 0; i < queries.size(); i++) {
                String start = queries.get(i).get(0);
                String end = queries.get(i).get(1);

                if (!graph.containsKey(start) || !graph.containsKey(end)) res[i] = -1;
                else if (start.equals((end))) res[i] = 1.0;
                else res[i] = dfs(start,end,1.0,new HashSet<>(),graph);
            }
            return res;
        }

        /**
         * dfs
         *
         * @param curr       当前节点
         * @param target     目标节点
         * @param accProduct 累计乘积
         * @param visited    访问过节点
         * @param graph      图
         * @return 乘积，找不到就是-1
         */
        private double dfs(String curr, String target, double accProduct, Set<String> visited, Map<String, Map<String, Double>> graph) {
            // 找到目标，返回累积值
            if (curr.equals(target)) {
                return accProduct;
            }

            // 标记已经访问过当前节点
            visited.add(curr);

            // 递归相乘：获取邻居，如果没有访问过，相乘，传递
            Map<String, Double> neighbors = graph.get(curr);
            if (neighbors != null) {
                for (String nextNode : neighbors.keySet()) {
                    if (!visited.contains(nextNode)) {
                        double weight = neighbors.get(nextNode);
                        // 递归：路径乘积变为 accProduct * weight
                        double result = dfs(nextNode, target, accProduct * weight, visited, graph);

                        // 如果找到有效路径，直接向上传递结果
                        if (result != -1.0) {
                            return result;
                        }
                    }
                }
            }
            return -1;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
