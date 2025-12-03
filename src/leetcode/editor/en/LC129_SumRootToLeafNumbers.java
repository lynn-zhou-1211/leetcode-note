package src.leetcode.editor.en;

import src.leetcode.editor.en.utils.TreeNode;

public class LC129_SumRootToLeafNumbers {
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
        public int sumNumbers(TreeNode root) {
            return dfs(root,0);
        }
        // 向上传递+向下汇总
        public int dfs(TreeNode root, int prevSum){
            if(root==null) return 0;

            int sum = prevSum*10+root.val;

            if(root.left==null && root.right==null) return sum;

            return dfs(root.left,sum) + dfs(root.right,sum);

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
