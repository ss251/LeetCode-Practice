// productExceptSelf
// https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/530/week-3/3300/

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int length = nums.length;
        int output[] = new int[length];

        output[0] = 1;

        for(int i = 1; i < length; i++) {
            output[i] = output[i-1] * nums[i-1];
        }

        int right = 1;

        for (int i = length - 1; i>=0; i--){
            output[i] = output[i] * right;
            right = right * nums[i];
        }

        return output;
    }
}
