package hashmap;

import java.util.*;

public class anagram_of_string {

    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if (s == null || p == null || s.length() < p.length()) return result;

        int k = p.length();
        HashMap<Character, Integer> pCount = new HashMap<>();
        for (char ch : p.toCharArray()) {
            pCount.put(ch, pCount.getOrDefault(ch, 0) + 1);
        }

        HashMap<Character, Integer> windowCount = new HashMap<>();
        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            char rightChar = s.charAt(right);
            windowCount.put(rightChar, windowCount.getOrDefault(rightChar, 0) + 1);

            // If window size exceeds p length, shrink from left
            if (right - left + 1 > k) {
                char leftChar = s.charAt(left);
                windowCount.put(leftChar, windowCount.get(leftChar) - 1);
                if (windowCount.get(leftChar) == 0) {
                    windowCount.remove(leftChar);
                }
                left++;
            }

            // When window size equals p length, compare maps
            if (right - left + 1 == k && windowCount.equals(pCount)) {
                result.add(left);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";

        List<Integer> indices = findAnagrams(s, p);
        System.out.println("Anagram start indices: " + indices);
    }
}
