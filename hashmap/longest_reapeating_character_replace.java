
package hashmap;

import java.util.HashMap;
import java.util.Collections;

public class longest_reapeating_character_replace {

    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> countMap = new HashMap<>();
        int left = 0;
        int maxLen = 0;

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            countMap.put(ch, countMap.getOrDefault(ch, 0) + 1);

            int maxCount = Collections.max(countMap.values());

            while ((right - left + 1) - maxCount > k) {
                char leftChar = s.charAt(left);
                countMap.put(leftChar, countMap.get(leftChar) - 1);
                if (countMap.get(leftChar) == 0) {
                    countMap.remove(leftChar);
                }
                left++;
                maxCount = Collections.max(countMap.values());
            }

            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}

