package algorithm;

public class Problem1863 {
    int ans = 0;
    public int subsetXORSum(int[] nums) {
        for(int i=0; i<nums.length; i++) {
            rec(nums[i], i + 1, nums);
        }
        return ans;
    }

     void rec(int sum, int index, int[] nums) {
        ans += sum;
         for(int i=index; i<nums.length; i++) {
             rec(sum ^ nums[i], i + 1, nums);
         }
     }
}
