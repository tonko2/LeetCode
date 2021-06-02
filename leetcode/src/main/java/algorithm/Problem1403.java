package algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem1403 {
    public List<Integer> minSubsequence(int[] nums) {
        if (nums.length == 1) {
            return Collections.singletonList(nums[0]);
        }

        int sum = 0;
        int[] cnt = new int[101];
        for (int num : nums) {
            sum += num;
            cnt[num]++;
        }

        int resSum = 0;
        List<Integer> res = new ArrayList<>();
        for (int i = 100; i >= 1; i--) {
            while (cnt[i] > 0) {
                if (sum >= resSum) {
                    sum -= i;
                    resSum += i;
                    cnt[i]--;
                    res.add(i);
                } else {
                    break;
                }
            }
        }
        return res;
    }
}
