// groupAnagrams
// https://leetcode.com/problems/group-anagrams/submissions/

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<String, List<String>>();
        List<List<String>> output = new ArrayList<List<String>>();
        if(strs == null || strs.length ==0) return output;
        for (String str: strs) {

         char[] letter = str.toCharArray();
         Arrays.sort(letter);
         String newStr = new String(letter);

         if(!(map.containsKey(newStr))) {
             List<String> list = new ArrayList<>();
             list.add(str);
             map.put(newStr, list);
         }
         else {
             map.get(newStr).add(str);
         }
        }
        for (String key: map.keySet()) {
            List<String> list = map.get(key);
            output.add(list);
        }
        //output = new ArrayList<List<String>>(map.values());
        return output;
    }
}
