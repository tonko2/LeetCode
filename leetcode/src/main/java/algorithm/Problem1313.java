package algorithm;

public class Problem1313 {
    public int[] decompressRLElist(int[] nums) {
        int arraySize = 0;
        for(int i=0; i<nums.length; i+=2) {
            arraySize += nums[i];
        }
        int[] ans = new int[arraySize];
        int index = 0;
        for(int i=0; i<nums.length; i+=2) {
            for(int j=0; j<nums[i]; j++) {
                ans[index++] = nums[i+1];
            }
        }
        return ans;
    }
}
