// maxBinarySubArray
// https://leetcode.com/problems/contiguous-array/

class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int count = 0;
        int maxLength = 0;
        map.put(0, -1);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                count -= 1;
            }
            else {
                count += 1;
            }

            if (!(map.containsKey(count))) {
                map.put(count, i);
            } else {
                maxLength = Math.max(maxLength, i-map.get(count));
            }
        }
        return maxLength;
    }
}
