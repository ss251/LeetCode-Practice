// https://leetcode.com/problems/happy-number/
// 202. Happy Number

class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        while (n != 1 && !set.contains(n)) {
            set.add(n);
            n = squareSum(n);
        }
        
        return n == 1;
    }
    
    private int squareSum(int n) {
        int sum = 0;
        while (n != 0) {
            int temp = n % 10;
            sum = sum + (temp * temp);
            n = n / 10;
        }
        return sum;
    }
}