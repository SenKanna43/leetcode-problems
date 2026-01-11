package arrays;

import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s){
        int left = 0;
        int maxLen = 0;
        Set<Character> window = new HashSet<>();
        for (int right = 0 ; right < s.length(); right++){
            while(window.contains(s.charAt(right))){
                window.remove(s.charAt(left));
                left++;
            }
            window.add(s.charAt(right));
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
}
