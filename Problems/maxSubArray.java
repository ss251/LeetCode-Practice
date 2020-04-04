// maxSubArray

https://leetcode.com/explore/featured/card/30-day-leetcoding-challenge/528/week-1/3285/

class Solution {
    public int maxSubArray(int[] nums) {
        int current_max = 0;
        int largest_sum = nums[0];

        largest_sum = nums[0];
        for (int i = 0; i < nums.length; i++) {
            current_max = current_max + nums[i];
            if (largest_sum < current_max)
                largest_sum = current_max;
            if (current_max < 0)
                current_max = 0;
        }
        return largest_sum;
    }
}
