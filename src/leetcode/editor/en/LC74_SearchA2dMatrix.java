package src.leetcode.editor.en;

import java.lang.foreign.MemorySegment;
import java.util.logging.Level;

public class LC74_SearchA2dMatrix{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;

        int left = 0;
        int right = m*n-1;

        while (left<=right){
            int mid = left+(right-left)/2;
            int i = mid/m;
            int j = mid-m*i;
            if(matrix[i][j]==target) return true;
            if(matrix[i][j]>target) right=mid-1;
            else left = mid+1;
        }
        return false;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
