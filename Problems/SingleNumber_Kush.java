// https://leetcode.com/problems/single-number/
// 136. Single Number


class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        
        for (int i : nums) {
            if (!hashMap.containsKey(i)) {
                hashMap.put(i, 0);
            }
            hashMap.put(i, hashMap.get(i) + 1);
        }
        
        for (int i : nums) {
            if (hashMap.get(i) == 1) {
                return i;
            }
        }
        
        return 0;
    }
}