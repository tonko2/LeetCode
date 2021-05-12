package algorithm;

import java.util.*;

public class Problem1748 {
    public int sumOfUnique(int[] nums) {
        int[] map = new int[101];
        int ans = 0;
        for (int num : nums) {
            if (map[num] == 0) {
                ans += num;
            } else if (map[num] == 1) {
                ans -= num;
            }
            map[num]++;
        }
        return ans;
    }
}
