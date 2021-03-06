package algorithm;

public class Problem1480 {
    public static int[] runningSum(int[] nums) {
        int[] res = new int[nums.length];
        int sum = 0;
        for(int i=0; i<nums.length; i++) {
            sum += nums[i];
            res[i] = sum;
        }
        return res;
    }
}
