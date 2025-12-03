package src.leetcode.editor.en;

import src.leetcode.editor.en.utils.TreeNode;

import java.util.*;
import java.util.stream.Collectors;

public class LC103_BinaryTreeZigzagLevelOrderTraversal{
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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res;

        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);
        int order = 1;

        while (!queue.isEmpty()){
            int size = queue.size();
            List<Integer> layer = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                layer.add(node.val);
                if(node.left!=null) queue.offer(node.left);
                if(node.right!=null) queue.offer(node.right);
            }

            //order
            if(order==1){
                res.add(layer);
            }else{
                Collections.reverse(layer);
                res.add(layer);
            }
            order*=-1;
        }

        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
