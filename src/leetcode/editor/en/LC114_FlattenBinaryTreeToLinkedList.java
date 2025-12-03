package src.leetcode.editor.en;

import com.sun.nio.file.ExtendedOpenOption;
import src.leetcode.editor.en.utils.TreeNode;

public class LC114_FlattenBinaryTreeToLinkedList{
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
    public void flatten(TreeNode root) {
        if(root==null) return;
        if(root.left==null && root.right==null) return;
        if(root.right== null){
            flatten(root.left);
            root.right = root.left;
            root.left = null;
        }else if(root.left==null){
            flatten(root.right);
        }else{
            flatten(root.left);
            flatten(root.right);
            // 找到左孩子的最右边节点
            TreeNode cur = root.left;
            while (cur.right!=null){
                cur = cur.right;
            }
            // 重新连接
            cur.right = root.right;
            root.right = root.left;
            root.left = null;
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
