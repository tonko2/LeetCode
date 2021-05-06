package algorithm;

public class Problem1827 {
    public int minOperations(int[] nums) {
        int ans = 0;
        for(int i=0; i<nums.length-1; i++) {
            int add = Math.max(0, nums[i] - nums[i+1] + 1);
            ans += add;
            nums[i+1] += add;
        }
        return ans;
    }
}
