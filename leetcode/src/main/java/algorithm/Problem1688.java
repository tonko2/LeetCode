package algorithm;

public class Problem1688 {
    public int numberOfMatches(int n) {
        int ans = 0;
        while (n != 1) {
            if (n % 2 == 0) {
                ans += n / 2;
                n /= 2;
            } else {
                ans += 1 + (n - 1) / 2;
                n = (n - 1) / 2;
            }
        }
        return ans;
    }
}
