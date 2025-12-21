package src.leetcode.editor.en;

public class LC130_SurroundedRegions{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public void solve(char[][] board) {
        int n = board.length;
        int m = board[0].length;
        // 遍历四周，标记为其他颜色；遍历中间，沉岛
        for (int i = 0; i <n; i++) {
            if(board[i][0]=='O')dfs(board,i,0,'Y');
            if(board[i][m-1]=='O')dfs(board,i,m-1,'Y');

        }
        for (int j = 0; j < m; j++) {
            if(board[0][j]=='O') dfs(board,0,j,'Y');
            if(board[n-1][j]=='O') dfs(board,n-1,j,'Y');
        }
        for (int i = 1; i <n-1; i++) {
            for (int j = 1; j < m-1; j++) {
                if(board[i][j]=='O')dfs(board,i,j,'X');
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(board[i][j]=='Y') board[i][j]='O';
            }
        }

    }
    private void dfs(char[][] board, int x,int y,char symbol){
        // 周围：'Y'
        if(x<0 || x>=board.length || y<0 || y>=board[0].length) return;
        if(board[x][y]=='X' || board[x][y]=='Y') return;
        board[x][y]=symbol;
        dfs(board,x+1,y,symbol);
        dfs(board,x-1,y,symbol);
        dfs(board,x,y+1,symbol);
        dfs(board,x,y-1,symbol);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
