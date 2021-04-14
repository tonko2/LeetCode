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

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] ans = runningSum(nums);
        for(int i=0; i<ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
}
