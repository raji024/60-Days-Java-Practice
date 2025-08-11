package hashmap;

import java.util.*;

public class permuattion_in_string {
    public static boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;

        int k = s1.length();
        HashMap<Character, Integer> target = new HashMap<>();
        HashMap<Character, Integer> window = new HashMap<>();

        // store s1 frequency
        for (char ch : s1.toCharArray()) {
            target.put(ch, target.getOrDefault(ch, 0) + 1);
        }

        int left = 0;
        for (int right = 0; right < s2.length(); right++) {
            char c = s2.charAt(right);
            window.put(c, window.getOrDefault(c, 0) + 1);

            // shrink to maintain exact window size k
            if (right - left + 1 > k) {
                char leftChar = s2.charAt(left);
                window.put(leftChar, window.get(leftChar) - 1);
                if (window.get(leftChar) == 0) {
                    window.remove(leftChar);
                }
                left++;
            }

            // check if maps match when window size is exactly k
            if (right - left + 1 == k && window.equals(target)) {
                return true;
            }
        }

        return false;
    }

    // Example usage
    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "eidbaooo";
        System.out.println(checkInclusion(s1, s2)); // true
    }
}
