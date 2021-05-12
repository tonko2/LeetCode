package algorithm;

public class Problem1837 {
    public int sumBase(int n, int k) {
        Integer.toStrin
        int ans = 0;
        while(n != 0) {
            ans += n % k;
            n /= k;
        }
        return ans;
    }
}
