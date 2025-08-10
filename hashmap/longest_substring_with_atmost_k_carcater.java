package hashmap;

import java.util.HashMap;

public class longest_substring_with_atmost_k_carcater {

    public static int kDistinctChar(String s, int k) {
        HashMap<Character, Integer> n = new HashMap<>();
        int left = 0;
        int max = 0;

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            n.put(ch, n.getOrDefault(ch, 0) + 1);

            while (n.size() > k) {
                char leftChar = s.charAt(left);
                n.put(leftChar, n.get(leftChar) - 1);
                if (n.get(leftChar) == 0) {
                    n.remove(leftChar);
                }
                left++;
            }

            max = Math.max(max, right - left + 1);
        }

        return max;
    }

    public static void main(String[] args) {
        String s = "eceba";
        int k = 2;
        System.out.println("Longest substring length: " + kDistinctChar(s, k));
    }
}
