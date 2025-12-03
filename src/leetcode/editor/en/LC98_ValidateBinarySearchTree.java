package src.leetcode.editor.en;

import src.leetcode.editor.en.utils.TreeNode;

public class LC98_ValidateBinarySearchTree{
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

// 不要直接比较当前节点和孩子，把当前节点的值作为参数传递下去
class Solution {
    public boolean isValidBST(TreeNode root) {
        return validate(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    private boolean validate(TreeNode root, long min, long max){
        // 结束条件1:走到尽头，没有发现问题
        if(root==null) return true;
        // 结束条件2:没走到尽头，发现问题
        if (root.val<=min || root.val>=max) return false;
        //递归检查左右孩子
        return validate(root.left,min,root.val) &&
                validate(root.right,root.val,max);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
