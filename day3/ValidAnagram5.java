package day3;

import java.util.Arrays;

public class ValidAnagram5 {

// Input: s = "anagram", t = "nagaram"
// Output: true
    class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        
        Arrays.sort(sChars);
        Arrays.sort(tChars);
        
        return Arrays.equals(sChars, tChars);
    }
}
