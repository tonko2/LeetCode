package algorithm;

public class Problem977v2 {
    public int[] sortedSquares(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        int[] ans  = new int[nums.length];
        for(int i=nums.length - 1; i>=0; i--) {
            if (nums[low] * nums[low] < nums[high] * nums[high]) {
                ans[i] =  nums[high] * nums[high];
                high--;
            } else {
                ans[i] = nums[low] * nums[low];
                low++;
            }
        }
        return ans;
    }
}
