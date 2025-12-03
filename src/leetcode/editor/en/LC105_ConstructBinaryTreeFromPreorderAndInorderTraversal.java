package src.leetcode.editor.en;

import src.leetcode.editor.en.utils.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class LC105_ConstructBinaryTreeFromPreorderAndInorderTraversal{
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
    Map<Integer, Integer> map;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        map= new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i],i);
        }
        return build(preorder,0,preorder.length-1,
                inorder,0,inorder.length-1);
    }
    private TreeNode build(int[] preorder, int preStart, int preEnd,
                       int[] inorder, int inStart, int inEnd){
        // exit
        if(preStart>preEnd) return null;
        // root = preorder[start]
        // search root in inorder
        // left part of root is left; right part is right; build
        int rootVal = preorder[preStart];
        TreeNode rootNode = new TreeNode(rootVal);

        int rootIndex = map.get(rootVal);
        int leftSize = rootIndex-inStart;

        rootNode.left = build(preorder,preStart+1,preStart+leftSize,
                inorder,inStart,rootIndex-1);
        rootNode.right = build(preorder,preStart+leftSize+1,preEnd,
                inorder,rootIndex+1,inEnd);

        return rootNode;
    }

}
//leetcode submit region end(Prohibit modification and deletion)

}
