package src.leetcode.editor.en;

import src.leetcode.editor.en.utils.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;

public class LC173_BinarySearchTreeIterator{
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
class BSTIterator {
    private Deque<TreeNode> stack;

    public BSTIterator(TreeNode root) {
        stack = new ArrayDeque<>();
        // 将root及其左孩子一路push进栈
        while (root!=null){
            stack.push(root);
            root= root.left;
        }
    }
    
    public int next() {
        if(!hasNext()) return -1;
        // 栈内第一个节点，就是next
        TreeNode node = stack.poll();
        int val = node.val;
        // node是当前分支上最左的node
        // 如果存在node.right，进入，将右孩子及其左孩子一路push进展栈
        if(node.right!=null){
            node= node.right;
            while (node!=null){
                stack.push(node);
                node= node.left;
            }
        }
        return val;
    }
    
    public boolean hasNext() {
        return !stack.isEmpty();
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */
//leetcode submit region end(Prohibit modification and deletion)

}
