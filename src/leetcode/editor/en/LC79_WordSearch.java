package src.leetcode.editor.en;

import java.lang.management.BufferPoolMXBean;

public class LC79_WordSearch{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    int[][] DIRECTIONS = new int[][]{{1,0},{-1,0},{0,1},{0,-1}};
    public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                // 第一个字母符合，进入
                if( backtracking(board,word,i,j,0)) {
                    return true;
                }
            }
        }
        return false;
    }
    // 不做预判，值判断当前格子
    private boolean backtracking(char[][] board,String word,int i, int j,int index){
        // 退出条件：长度到达，满足条件
        if(index == word.length()) return true;
        // 检查当前格子是否满足条件
        if(i<0 || i>=board.length || j<0 || j>=board[0].length || board[i][j]!=word.charAt(index)){
            return false;
        }
        // 标记访问
        char temp = board[i][j];
        board[i][j] = '#';
        // 递归
        for (int[] dir : DIRECTIONS) {
            if(backtracking(board,word,i+dir[0],j+dir[1],index+1))
                return true;
        }
        // 回溯
        board[i][j]=temp;
        return false;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
