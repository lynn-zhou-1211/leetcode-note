package src.leetcode.editor.en;

import java.util.HashSet;
import java.util.Set;

public class LC202_HappyNumber{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        int cur = n;
        while (true){
            // 是否重复
            if(set.contains(cur)) return false;
            set.add(cur);

            // 生成新数字
            int sum = 0;
            while (cur>0){
                int num = cur%10;
                sum+= num*num;
                cur/=10;
            }
            if(sum ==1) return true;

            // 更新下一轮数字
            cur=sum;
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
