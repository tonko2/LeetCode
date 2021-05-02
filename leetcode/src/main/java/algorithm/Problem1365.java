package algorithm;

public class Problem1365 {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] temp = new int[101];
        for(int i=0; i<nums.length; i++) {
            temp[nums[i]]++;
        }
        for(int i=1; i<101; i++) {
            temp[i] += temp[i-1];
        }

        int[] ans = new int[nums.length];
        for(int i=0; i<nums.length; i++) {
            if (nums[i] == 0) {
                ans[i] = 0;
            } else {
                ans[i] = temp[nums[i]-1];
            }
        }
        return ans;
    }
}
