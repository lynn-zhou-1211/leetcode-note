package src.leetcode.editor.en;

public class LC684_RedundantConnection {
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        int[] parent;
        public int[] findRedundantConnection(int[][] edges) {
            int n = edges.length;
            parent = new int[n+1];
            for (int i = 1; i <= n; i++) {
                parent[i]=i;
            }
            for (int[] edge : edges) {
                int u = edge[0];
                int v = edge[1];

                // 1️⃣find，而非 parent
                int rootU = find(u);
                int rootV = find(v);

                // 如果根一样，说明有环；不一样就合并
                if(rootU==rootV) {
                    return new int[]{u,v};
                }else{
                    // 2️⃣帮派合并：
                    //    直接让老大跟老大谈
                    //    如果 parent[u]=v; 会导致老大的其他小弟没法更新到新帮派
                    parent[rootU]=rootV;
                }
            }
            return new int[]{-1,-1};
        }

        // 路径压缩
        private int find(int node) {
            if(parent[node]!=node){
                parent[node]=find(parent[node]);
            }
            return parent[node];
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
