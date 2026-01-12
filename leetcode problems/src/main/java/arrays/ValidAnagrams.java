package arrays;

import java.util.HashMap;

public class ValidAnagrams
{
    public boolean validAnagram(String s, String t){
        // To count the freq of char from string s
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0) + 1);
        }
        // check char of t present in map if present reduce freq
        for (char ch : t.toCharArray()){
            if (!map.containsKey(ch)) return false;
            map.put(ch,map.get(ch) - 1);
            if(map.get(ch) == 0){
                map.remove(ch);
            }
        }
        return map.isEmpty();
    }
}
