package algorithm;

public class Problem1365 {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int res[] = new int[nums.length];
        for(int i=0; i<nums.length; i++) {
            int ans = 0;
            for(int j=0; j<nums.length; j++) {
                if (i != j) {
                    if (nums[i] > nums[j]) {
                        ans++;
                    }
                }
            }
            res[i] = ans;
        }
        return res;
    }
}
