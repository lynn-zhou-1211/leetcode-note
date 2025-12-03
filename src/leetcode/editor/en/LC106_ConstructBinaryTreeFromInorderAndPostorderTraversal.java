package src.leetcode.editor.en;
import src.leetcode.editor.en.utils.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class LC106_ConstructBinaryTreeFromInorderAndPostorderTraversal{
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
    // 从右往左遍历postorder，寻找root
    Map<Integer,Integer> map;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        map= new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i],i);
        }
        return build(inorder,0,inorder.length-1,
                postorder,0,postorder.length-1);
    }
    private TreeNode build(int[] inorder, int inStart, int inEnd,
                           int[] postorder,int postStart, int postEnd){
        if(inStart>inEnd) return null;
        int rootVal = postorder[postEnd];
        TreeNode rootNode= new TreeNode(rootVal);

        int rootIndex = map.get(rootVal);
        int leftSize = rootIndex-inStart;

        rootNode.left = build(inorder,inStart,rootIndex-1,
                postorder,postStart,postStart+leftSize-1);
        rootNode.right= build(inorder,rootIndex+1,inEnd,
                postorder,postStart+leftSize,postEnd-1);

        return rootNode;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
