package src.leetcode.editor.en;

import java.util.Arrays;

public class LC452_MinimumNumberOfArrowsToBurstBalloons{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int findMinArrowShots(int[][] points) {

        int count =1;
        Arrays.sort(points,(a,b)->Integer.compare(a[1],b[1]));
        int currentEnd = points[0][1];
        for (int[] point : points) {
            if(point[0]>currentEnd){
                count++;
                currentEnd= point[1];
            }
        }
        return count;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
