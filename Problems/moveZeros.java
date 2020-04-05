// Move zeros
// https://leetcode.com/explore/featured/card/30-day-leetcoding-challenge/528/week-1/3286/

class Solution {
    public void moveZeroes(int[] nums) {
        //O(n^2)
        /*int pointerFront = 0;
        int pointerBack = nums.length - 1;
        while (pointerFront != pointerBack) {
            if (nums[pointerFront]!=0) {
                pointerFront++;
            }
            else {
                for(int i = pointerFront; i < pointerBack; i++) {
                    nums[i] = nums[i+1];
                }
                nums[pointerBack] = 0;
                pointerBack--;
            }
        }*/
        //O(n)
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != 0)
                nums[count++] = nums[i];
        }
        for (int i = count; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
