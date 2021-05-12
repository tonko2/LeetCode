package algorithm;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Problem921 {
    public int repeatedNTimes(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int ans = 0;
        for (int num : nums) {
            if (set.contains(num)) {
                ans = num;
                break;
            }
            set.add(num);
        }
        return ans;
    }
}
