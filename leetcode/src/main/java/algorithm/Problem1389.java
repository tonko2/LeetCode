package algorithm;

import java.util.ArrayList;
import java.util.List;

public class Problem1389 {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> list = new ArrayList<>();

        for(int i=0; i<nums.length; i++) {
            list.add(index[i], nums[i]);
        }

        int[] ans = new int[nums.length];
        for(int i=0; i<list.size(); i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }
}
