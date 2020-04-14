// lastStoneWeight
// https://leetcode.com/problems/last-stone-weight/submissions/

class Solution {
    public int lastStoneWeight(int[] stones) {
        if(stones.length == 1){
            return stones[0];
        }
        Arrays.sort(stones);

        while(stones[stones.length-2]!=-1){
        if(stones[stones.length-1] == stones[stones.length-2]) {
            stones[stones.length-1] = -1;
            stones[stones.length-2] = -1;
            Arrays.sort(stones);
        }
        else {
            stones[stones.length-1] = stones[stones.length-1] -
                                      stones[stones.length-2];
            stones[stones.length-2] = -1;
            Arrays.sort(stones);
        }
        }
        if(stones[stones.length-2]==stones[stones.length-1])
            return 0;
        else
            return stones[stones.length-1];
    }
}
