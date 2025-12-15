package src.leetcode.editor.en;

public class LC69_Sqrtx{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int mySqrt(int x) {
        if(x==0) return 0;

        int sqrt = 1;
        while(x/sqrt>=sqrt){
            sqrt++;
        }
        return sqrt-1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
