package src.leetcode.editor.en;

import src.leetcode.editor.en.utils2.Node;

public class LC427_ConstructQuadTree {
    //leetcode submit region begin(Prohibit modification and deletion)
/*
// Definition for a QuadTree node.
class Node {
    public boolean val;
    public boolean isLeaf;
    public Node topLeft;
    public Node topRight;
    public Node bottomLeft;
    public Node bottomRight;


    public Node() {
        this.val = false;
        this.isLeaf = false;
        this.topLeft = null;
        this.topRight = null;
        this.bottomLeft = null;
        this.bottomRight = null;
    }

    public Node(boolean val, boolean isLeaf) {
        this.val = val;
        this.isLeaf = isLeaf;
        this.topLeft = null;
        this.topRight = null;
        this.bottomLeft = null;
        this.bottomRight = null;
    }

    public Node(boolean val, boolean isLeaf, Node topLeft, Node topRight, Node bottomLeft, Node bottomRight) {
        this.val = val;
        this.isLeaf = isLeaf;
        this.topLeft = topLeft;
        this.topRight = topRight;
        this.bottomLeft = bottomLeft;
        this.bottomRight = bottomRight;
    }
}
*/

    // Definition for a QuadTree node.

    class Solution {
        public Node construct(int[][] grid) {
            return build(grid, 0, 0, grid.length);
        }

        /**
         * 递归函数
         *
         * @param grid 原始矩阵
         * @param r    当前处理区域的左上角行坐标
         * @param c    当前处理区域的左上角列坐标
         * @param size 当前处理区域的边长
         */
        private Node build(int[][] grid, int r, int c, int size) {
            // Base Case: 如果边长为 1，它一定是一个叶子节点
            if (size == 1) {
                // val: grid[r][c] == 1, isLeaf: true
                return new Node(grid[r][c] == 1, true);
            }

            // Divide: 计算一半的长度
            int half = size / 2;

            // Conquer: 递归构建四个子区域
            // 左上
            Node tl = build(grid, r, c, half);
            // 右上 (列坐标 + half)
            Node tr = build(grid, r, c + half, half);
            // 左下 (行坐标 + half)
            Node bl = build(grid, r + half, c, half);
            // 右下 (行 + half, 列 + half)
            Node br = build(grid, r + half, c + half, half);

            // Merge: 判断是否可以合并
            // 条件：4个孩子都是叶子，且它们的值全都相等
            if (tl.isLeaf && tr.isLeaf && bl.isLeaf && br.isLeaf &&
                    tl.val == tr.val && tr.val == bl.val && bl.val == br.val) {

                // 合并成功！返回一个新的大叶子节点
                // 它的值等于任意一个孩子的值（这里取 tl.val）
                return new Node(tl.val, true);
            }

            // 无法合并：创建一个内部节点 (val 随便填，这里填 true，isLeaf 为 false)
            // 将刚才递归得到的四个节点挂载上去
            return new Node(true, false, tl, tr, bl, br);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
