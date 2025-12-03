package src.leetcode.editor.en;

import com.sun.source.tree.Tree;
import src.leetcode.editor.en.utils.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class LC230_KthSmallestElementInABst {
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
    // =======recursion========
    //    private int rank = 0;
    //    private int res = 0;
    //    public int kthSmallest(TreeNode root, int k) {
    //        traverse(root,k);
    //        return res;
    //    }
    //    private void traverse(TreeNode root, int k){
    //        if(root==null) return;
    //        traverse(root.left,k);
    //
    //        if(rank>= k) return;
    //        rank++;
    //        if(k==rank) {
    //            res = root.val;
    //            return;
    //        }
    //
    //        traverse(root.right,k);
    //    }

        // ==========iteration=======
        public int kthSmallest(TreeNode root, int k) {
            Deque<TreeNode> stack = new ArrayDeque<>();
            stack.push(root);
            while (root != null || !stack.isEmpty()) {
                // 一路将左节点入栈，直到null
                while (root != null) {
                    stack.push(root);
                    root = root.left;
                }

                // 回溯：将最近一个父节点pop，设置为当前节点，处理
                root = stack.poll();
                k--;
                if (k == 0) return root.val;
                // 处理right
                root = root.right;
            }
            return -1;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)
}
