package algorithm;

public class Problem1512 {
    public int numIdenticalPairs(int[] nums) {
        int[] a = new int[101];
        int ans = 0;
        for(int i=0; i<nums.length; i++) {
            if (a[nums[i]] != 0) {
                ans += a[nums[i]];
            }
            a[nums[i]]++;
        }
        return ans;
    }
}
