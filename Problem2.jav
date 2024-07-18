public String longestPalindrome(String s) {
    // Input: s = "babad"
    // Output: "bab"

	int maxlen = 1;
	String maxSrt = s.substring(0,1);

	for(int i=0 ; i<s.length(); i++){
	    for(int j= i+1 ; j<=s.length(); j++){  // note using substring so j<=s.length()
	        
	       if( j-i > maxlen && isPalindrome(s.substring(i,j))){ // if length of substring and isPalindrome
	           maxlen = j-i;
	           maxSrt = s.substring(i,j);
	       }
	    }
	}
	// System.out.print(maxSrt);
    return maxSrt;        
    }

    private boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
	}


    // Given a string `s`, return the longest palindromic substring in `s`.