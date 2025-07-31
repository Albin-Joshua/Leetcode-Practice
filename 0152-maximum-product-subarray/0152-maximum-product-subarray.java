/*At each step, multiply current number with both curMax and curMin — because a negative number can flip min to max or vice versa.

Update curMax as the best positive product ending here, and curMin as the worst (most negative).

Keep res to track the overall max product seen so far.*/

public class Solution {
    public int maxProduct(int[] nums) {
        int res = nums[0];
        int curMin = 1;
        int curMax = 1;
        for(int num:nums){
            int temp = curMax*num;
            curMax = Math.max(Math.max(temp, curMin*num), num);
            curMin = Math.min(Math.min(temp, curMin*num), num);
            res = Math.max(res, curMax);
        }
        return res;
    }
}