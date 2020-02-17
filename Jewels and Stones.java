// https://leetcode.com/problems/jewels-and-stones/
// 771. Jewels and Stones

class Solution {
    public int numJewelsInStones(String J, String S) {
        int num = 0;
        for (int i = 0; i < S.length(); i++) {
            for (int j = 0; j < J.length(); j++) {
                if (J.charAt(j) == S.charAt(i)) {
                    num++;
                }
            }
        }
        return num;
    }
}
