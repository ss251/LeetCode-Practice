/* https://leetcode.com/problems/word-pattern/ */


class Solution {
    public boolean wordPattern(String pattern, String str) {
    String[] strArray = str.split(" ");

    if(strArray.length != pattern.length())
        return false;

    HashMap<Character, String> map = new HashMap<Character, String>();
    for(int i=0; i<pattern.length(); i++){
        char c = pattern.charAt(i);
        if(map.containsKey(c)){
            String value = map.get(c);
            if(!value.equals(strArray[i])){
                return false;
            }
        }else if (map.containsValue(strArray[i])){
            return false;
        }
        map.put(c, strArray[i]);
    }

    return true;
}
}
