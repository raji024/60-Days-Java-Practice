package proactice_for_lucid;

import java.util.*;

public class longest_substring_with_k_uniques {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input
        String s = sc.next();
        int k = sc.nextInt();

        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0;
        int max = -1; // if no substring found, return -1

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            map.put(ch, map.getOrDefault(ch, 0) + 1);

            while (map.size() > k) {
                char leftChar = s.charAt(left);
                map.put(leftChar, map.get(leftChar) - 1);
                if (map.get(leftChar) == 0) {
                    map.remove(leftChar);
                }
                left++;
            }

            if (map.size() == k) {
                max = Math.max(max, right - left + 1);
            }
        }

        System.out.println(max);
    }
}
