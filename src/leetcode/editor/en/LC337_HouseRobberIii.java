package src.leetcode.editor.en;

import src.leetcode.editor.en.utils.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class LC337_HouseRobberIii {
    //leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode() {}
     * TreeNode(int val) { this.val = val; }
     * TreeNode(int val, TreeNode left, TreeNode right) {
     * this.val = val;
     * this.left = left;
     * this.right = right;
     * }
     * }
     */
    class Solution {
        // 会超时：用map存储
        Map<TreeNode,Integer> memo = new HashMap<>();
        public int rob(TreeNode root) {
            return dfs(root);
        }

        private int dfs(TreeNode root) {
            if (root == null) return 0;
            // 1. 查表
            if(memo.containsKey(root)) return memo.get(root);

            // 2. 核心逻辑
            if (root.left == null && root.right == null) return root.val;
            // 选自己，不选孩子
            int sum1 = root.val +
                    (root.left == null ? 0 : dfs(root.left.left) + dfs(root.left.right)) +
                    (root.right == null ? 0 : dfs(root.right.left) + dfs(root.right.right));
            // 选孩子
            int sum2 = dfs(root.left) + dfs(root.right);
            int res=Math.max(sum1, sum2);

            // 3.记账：存入备忘录
            memo.put(root,res);

            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
