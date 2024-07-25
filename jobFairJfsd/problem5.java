// You are given a license key represented as a string s that consists of only alphanumeric characters and dashes. The string is separated into n + 1 groups by n dashes. You are also given an integer k.
// We want to reformat the string s such that each group contains exactly k characters, except for the first group, which could be shorter than k but still must contain at least one character. Furthermore, there must be a dash inserted between two groups, and you should convert all lowercase letters to uppercase.
// Return the reformatted license key.
 
// Example 1:
// Input: s = "5F3Z-2e-9-w", k = 4
// Output: "5F3Z-2E9W"
// Explanation: The string s has been split into two parts, each part has 4 characters.
// Note that the two extra dashes are not needed and can be removed.


public class problem5 {
    public static String reformatLicenseKey(String s, int k) {
        // Step 1: Remove dashes and convert to uppercase
        StringBuilder cleaned = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c != '-') {
                cleaned.append(Character.toUpperCase(c));
            }
        }

        // Step 2: Determine the length of the first group
        int length = cleaned.length();
        int firstGroupLength = length % k;
        StringBuilder result = new StringBuilder();

        // Step 3: Append the first group
        if (firstGroupLength > 0) {
            result.append(cleaned.substring(0, firstGroupLength));
            cleaned.delete(0, firstGroupLength);
        }

        // Step 4: Append the remaining groups of length k
        while (cleaned.length() > 0) {
            if (result.length() > 0) {
                result.append('-');
            }
            result.append(cleaned.substring(0, k));
            cleaned.delete(0, k);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String s1 = "5F3Z-2e-9-w";
        int k1 = 4;
        System.out.println(reformatLicenseKey(s1, k1)); // Output: "5F3Z-2E9W"

        String s2 = "2-5g-3-J";
        int k2 = 2;
        System.out.println(reformatLicenseKey(s2, k2)); // Output: "2-5G-3J"
    }
    
}
