class Solution {
    public int countElements(int[] arr) {
        int count = 0;
        if(arr.length > 1000 || arr.length < 1) {
            return 0;
        }
        Set<Integer> set = new HashSet<Integer>();
        for(int i: arr) {
            set.add(i);
        }
        for (int i = 0; i < arr.length; i++){
            if(set.contains(arr[i]+1)) {
                count+=1;
            }
        }
        return count;
    }
}
