package algorithm;

import java.util.Arrays;

public class Problem1464 {
    public int maxProduct(int[] nums) {
        int maxFirst = -1;
        int maxSecond = -1;
        for(int i=0; i<nums.length; i++) {
            if (maxFirst < nums[i]) {
                maxSecond = maxFirst;
                maxFirst = nums[i];
            } else if (maxSecond < nums[i]) {
                maxSecond = nums[i];
            }
        }
        return (maxFirst - 1) * (maxSecond - 1);
    }
}
