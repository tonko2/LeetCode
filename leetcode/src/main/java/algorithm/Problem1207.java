package algorithm;

import java.util.*;

public class Problem1207 {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int value : arr) {
            int x = map.getOrDefault(value, 0);
            map.put(value, x + 1);
        }
        Set<Integer> set = new HashSet<>();
        for (int value : map.values()) {
            if (!set.add(value)) {
                return false;
            }
        }
        return true;
    }
}
