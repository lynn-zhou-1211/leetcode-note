package src.leetcode.editor.en;

public class LC50_PowxN {
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public double myPow(double x, int n) {
            // 处理n=0
            if(n==0) return 1.0;

            // 防止溢出
            long N= n;

            // 负数处理
            if(N<0){
                N=-N;
                x=1/x;
            }

            // 标准快速幂
            double currentProduct = x;
            double ans =1.0;
            while (N>0){
                if(N%2==1){
                    ans*=currentProduct;
                }
                currentProduct*=currentProduct;
                N/=2;
            }
            return ans;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
