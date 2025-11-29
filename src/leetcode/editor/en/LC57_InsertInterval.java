package src.leetcode.editor.en;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC57_InsertInterval{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int n = intervals.length;
        List<int[]> res = new ArrayList<>();

        int i = 0;
        while(i<n && newInterval[0]>intervals[i][1]){
            res.add(intervals[i]);
            i++;
        }

        while (i < n && intervals[i][0] <= newInterval[1]) {
            // 更新 newInterval 的范围：取最小的 start，最大的 end
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            i++;
        }
        res.add(newInterval);

        // 3. 阶段三：右侧不重叠
        while (i < n) {
            res.add(intervals[i]);
            i++;
        }

        return res.toArray(new int[0][]);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
