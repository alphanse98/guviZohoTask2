
// Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
 
// Example 1:
// Input: s = "guvi"
// Output: 0

public class problem4 {
    public static int firstUniqChar(String s) {
        Map<Character, Integer> charCountMap = new HashMap<>();
        
        // Count the occurrences of each character
        for (char c : s.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }
        
        // Find the first non-repeating character
        for (int i = 0; i < s.length(); i++) {
            if (charCountMap.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        
        return -1; // No non-repeating character found
    }

    public static void main(String[] args) {
        String s1 = "guvi";
        String s2 = "geeks";
        String s3 = "aabb";
        
        System.out.println("Index of first non-repeating character in '" + s1 + "' is: " + firstUniqChar(s1));
        System.out.println("Index of first non-repeating character in '" + s2 + "' is: " + firstUniqChar(s2));
        System.out.println("Index of first non-repeating character in '" + s3 + "' is: " + firstUniqChar(s3));
    }
}
