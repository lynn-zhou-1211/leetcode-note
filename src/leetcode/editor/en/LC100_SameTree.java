package src.leetcode.editor.en;

import src.leetcode.editor.en.utils.TreeNode;

public class LC100_SameTree{
    //leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // preorder
        // is current.val equal?
        if(p==null && q== null) return true;
        if(p==null || q==null) return false;
        if(p.val != q.val) return false;
        // dfs
        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
