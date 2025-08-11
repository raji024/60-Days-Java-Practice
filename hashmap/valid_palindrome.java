package hashmap;

public class valid_palindrome {
    
    public boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        
        while (left < right) {
            if (s.charAt(left) == s.charAt(right)) {
                left++;
                right--;
            } else {
                // Try skipping one character from left or right
                return isPalindrome(s, left + 1, right) || isPalindrome(s, left, right - 1);
            }
        }
        
        return true;  // String is already palindrome
    }
    
    private boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
