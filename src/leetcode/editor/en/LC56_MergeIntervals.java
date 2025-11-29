package src.leetcode.editor.en;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC56_MergeIntervals{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[][] merge(int[][] intervals) {
       if(intervals.length == 0) return new int[0][0];
       Arrays.sort(intervals,(a,b)->a[0]-b[0]);

       List<int[]> res = new ArrayList<>();
       // put first interval
        int[] currentInterval = intervals[0];
        res.add(currentInterval);

        // update interval
        for (int[] interval : intervals) {
            if(interval[0]>currentInterval[1]){
                res.add(interval);
                currentInterval = interval;
            }else{
                currentInterval[1]=Math.max(currentInterval[1],interval[1]);
            }
        }
        return res.toArray(new int[res.size()][]);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
