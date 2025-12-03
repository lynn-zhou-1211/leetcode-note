package src.leetcode.editor.en;

import src.leetcode.editor.en.utils.TreeNode;

import java.util.zip.CRC32;

public class LC530_MinimumAbsoluteDifferenceInBst {
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
        int minDiff = Integer.MAX_VALUE;

        public int getMinimumDifference(TreeNode root) {
            // 使用 long 避免溢出，这样就不用位移 hack 了，更通用
            dfs(root, Long.MIN_VALUE, Long.MAX_VALUE);
            return minDiff;
        }

        private void dfs(TreeNode node, long min, long max) {
            if (node == null) return;

            // 如果 min 不是无穷小，说明左边有祖先，计算差值
            if (min != Long.MIN_VALUE) {
                minDiff = (int) Math.min(minDiff, node.val - min);
            }
            // 如果 max 不是无穷大，说明右边有祖先，计算差值
            if (max != Long.MAX_VALUE) {
                minDiff = (int) Math.min(minDiff, max - node.val);
            }

            // 带着新的范围继续找
            dfs(node.left, min, node.val);
            dfs(node.right, node.val, max);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
