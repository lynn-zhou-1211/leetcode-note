package src.leetcode.editor.en;

import src.leetcode.editor.en.utils.TreeNode;

public class LC222_CountCompleteTreeNodes{
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
    public int countNodes(TreeNode root) {
        if(root==null) return 0;
        return countNodes(root.left)+countNodes(root.right)+1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
