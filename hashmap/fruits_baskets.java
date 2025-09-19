package hashmap;
import java.util.*;

public class fruits_baskets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input: number of fruits
        int n = sc.nextInt();
        int[] fruits = new int[n];
        for (int i = 0; i < n; i++) {
            fruits[i] = sc.nextInt();
        }
        sc.close();

        // Sliding window to find max fruits in 2 baskets
        HashMap<Integer, Integer> basket = new HashMap<>();
        int left = 0;
        int maxLen = 0;

        for (int right = 0; right < fruits.length; right++) {
            basket.put(fruits[right], basket.getOrDefault(fruits[right], 0) + 1);

            while (basket.size() > 2) {
                int leftFruit = fruits[left];
                basket.put(leftFruit, basket.get(leftFruit) - 1);
                if (basket.get(leftFruit) == 0) {
                    basket.remove(leftFruit);
                }
                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
        }

        System.out.println(maxLen);
    }
}

