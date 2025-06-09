package day11;
import java.util.*;

public class fruits_into_baskets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int[] arr = new int[x];
        for (int i = 0; i < x; i++) {
            arr[i] = sc.nextInt();
        }

        Map<Integer, Integer> count = new HashMap<>();
        int left = 0, max = 0;

        for (int right = 0; right < arr.length; right++) {
            // add current fruit
            count.put(arr[right], count.getOrDefault(arr[right], 0) + 1);

            // shrink window until it has ≤ 2 types
            while (count.size() > 2) {
                count.put(arr[left], count.get(arr[left]) - 1);
                if (count.get(arr[left]) == 0) {
                    count.remove(arr[left]);
                }
                left++;            // move left edge
            }

            
            max = Math.max(max, right - left + 1);
        }

        System.out.println(max);
        sc.close();
    }
}
