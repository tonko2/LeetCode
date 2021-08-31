package algorithm;

public class Problem1920v2 {
    public int[] buildArray(int[] nums) {
        int mask = 1023; // Decimal value of the binary number '1111111111'
        for(int i = 0; i < nums.length; i++)
            nums[i] |= (nums[nums[i]] & mask) << 10;
        for(int i = 0; i < nums.length; i++)
            nums[i] = nums[i] >> 10;
        return nums;
    }
}
