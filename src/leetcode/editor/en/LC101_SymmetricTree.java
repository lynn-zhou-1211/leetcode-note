package src.leetcode.editor.en;
import src.leetcode.editor.en.utils.TreeNode;
public class LC101_SymmetricTree{
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
    public boolean isSymmetric(TreeNode root) {
        return dfs(root.left,root.right);
    }
    private boolean dfs(TreeNode p, TreeNode q){
        // 比较当前节点值
        if(p==null && q==null) return true;
        if(p==null || q==null) return false;
        if(p.val != q.val) return false;
        // dfs
        return dfs(p.left,q.right) && dfs(p.right,q.left);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
