package day2;
import java.util.*;

public class frequency_string {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        char ch[] = a.toCharArray();
        int freq[] = new int[256];

        // Count frequency of each character
        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            freq[c]++;
        }

        // Sort characters by frequency (descending), then by character (ascending)
        for (int i = 0; i < ch.length; i++) {
            for (int j = i + 1; j < ch.length; j++) {
                if (freq[ch[i]] < freq[ch[j]] || 
                   (freq[ch[i]] == freq[ch[j]] && ch[i] > ch[j])) {
                    char temp = ch[i];
                    ch[i] = ch[j];
                    ch[j] = temp;
                }
            }
        }

        // Build the result string
        StringBuilder r = new StringBuilder();
        for (int i = 0; i < ch.length; i++) {
            r.append(ch[i]);
        }

        System.out.println(r.toString());
    }
}
