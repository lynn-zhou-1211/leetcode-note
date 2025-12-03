package src.leetcode.editor.en;

import com.sun.source.tree.Tree;
import src.leetcode.editor.en.utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class LC257_BinaryTreePaths {
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
        List<String> res;

        public List<String> binaryTreePaths(TreeNode root) {
            res = new ArrayList<>();
            dfs(root, root.val + "");
            return res;
        }

        private void dfs(TreeNode root, String prevPath) {
            if (root.left == null && root.right == null){
                res.add(prevPath);
                return;
            }
            if(root.left!=null) dfs(root.left,prevPath+"->"+root.left.val);
            if(root.right!=null) dfs(root.right,prevPath+"->"+root.right.val);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
