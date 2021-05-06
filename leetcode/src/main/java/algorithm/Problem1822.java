package algorithm;

public class Problem1822 {
    public int arraySign(int[] nums) {
        int negative = 0;
        boolean zero = false;
        for (int num : nums) {
            if (num == 0) {
                zero = true;
            } else if (num < 0) {
                negative++;
            }
        }
        if (zero) {
            return 0;
        } else {
            return negative % 2 == 0 ? 1 : -1;
        }
    }
}
