package src.leetcode.editor.en;

import src.leetcode.editor.en.utils.TreeNode;

public class LC236_LowestCommonAncestorOfABinaryTree{
    //leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(!isAncestor(root,p) || !isAncestor(root,q)) return null;
        TreeNode minLeft = lowestCommonAncestor(root.left,p,q);
        TreeNode minRight = lowestCommonAncestor(root.right,p,q);
        if(minLeft!=null) return minLeft;
        else if (minRight!=null) return minRight;
        else return root;
    }
    private boolean isAncestor(TreeNode m, TreeNode n ){
        if(m==n) return true;
        if(m==null) return false;
        return isAncestor(m.left,n) || isAncestor(m.right,n);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
