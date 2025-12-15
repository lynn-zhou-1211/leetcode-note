package src.leetcode.editor.en;

public class LC200_NumberOfIslands{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {

    public int numIslands(char[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if(grid[i][j]=='1'){
                    dfs(grid,i,j);
                    count++;
                }
            }
        }
        return count;
    }
    private void dfs(char[][] grid, int r ,int c){
        if(r>=grid.length || r<0 || c>= grid[0].length || c<0) return;
        if(grid[r][c]=='0') return;

        grid[r][c]='0';

        dfs(grid,r+1,c);
        dfs(grid,r-1,c);
        dfs(grid,r,c+1);
        dfs(grid,r,c-1);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
