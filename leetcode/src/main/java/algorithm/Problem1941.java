package algorithm;

import java.util.HashMap;
import java.util.Map;

public class Problem1941 {
    public boolean areOccurrencesEqual(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            int cnt = map.getOrDefault(s.charAt(i), 0);
            map.put(s.charAt(i), cnt + 1);
        }

        for (int i = 0; i < s.length() - 1; i++) {
            int cnt1 = map.get(s.charAt(i));
            int cnt2 = map.get(s.charAt(i + 1));
            if (cnt1 != cnt2) {
                return false;
            }
        }
        return true;
    }
}
