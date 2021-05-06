package algorithm;

public class Problem1295 {
    public int findNumbers(int[] nums) {
        int ans = 0;
        for (int num : nums) {
            if (countDigit(num) % 2 == 0) {
                ans++;
            }
        }
        return ans;
    }

    int countDigit(int x) {
        int cnt = 0;
        while(x != 0) {
            x /= 10;
            cnt++;
        }
        return cnt;
    }
}
