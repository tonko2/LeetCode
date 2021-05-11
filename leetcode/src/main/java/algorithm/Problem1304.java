package algorithm;

public class Problem1304 {
    public int[] sumZero(int n) {
        if (n == 1) {
            return new int[1];
        } else {
            int[] ans = new int[n];
            int total = 0;
            for(int i=0; i<n-1; i++) {
                ans[i] = i+1;
                total += ans[i];
            }
            ans[n-1] = -total;
            return ans;
        }
    }
}
