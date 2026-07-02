class Solution {
    public boolean isPalindrome(int x) {
        String str = Integer.toString(x);  // Convert number to string
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;  // If mismatch found
            }
            left++;
            right--;
        }

        return true;  // All characters matched
    }

        
    }



