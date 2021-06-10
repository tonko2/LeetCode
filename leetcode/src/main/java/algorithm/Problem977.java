package algorithm;

public class Problem977 {
    public int[] sortedSquares(int[] nums) {
        int mid = 0;
        int absValue = 10000;
        for(int i=0; i<nums.length; i++) {
            if (absValue > Math.abs(nums[i])) {
                absValue = Math.abs(nums[i]);
                mid = i;
            }
        }
        int left = mid - 1;
        int right = mid + 1;
        int[] ans = new int[nums.length];
        ans[0] = nums[mid] * nums[mid];
        int index = 1;
        while(left >= 0 || right < nums.length) {
            if (left < 0) {
                ans[index++] = nums[right] * nums[right];
                right++;
            } else if(right >= nums.length) {
                ans[index++] = nums[left] * nums[left];
                left--;
            } else {
                if (nums[left] * nums[left] < nums[right] * nums[right]) {
                    ans[index++] = nums[left] * nums[left];
                    left--;
                } else {
                    ans[index++] = nums[right] * nums[right];
                    right++;
                }
            }
        }
        return ans;
    }
}
