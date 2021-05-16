package algorithm;

public class Problem1742 {
    public int countBalls(int lowLimit, int highLimit) {
        int[] sum = new int[46];
        int ans = 0;
        for(int i=lowLimit; i<=highLimit; i++) {
            int x = transform(i);
            sum[x]++;
            ans = Math.max(ans, sum[x]);
        }
        return ans;
    }

    private int transform(int x) {
        int res = 0;
        while(x != 0) {
            res += x % 10;
            x /= 10;
        }
        return res;
    }
}
