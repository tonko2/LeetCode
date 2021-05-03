package algorithm;

public class Problem1486 {
    public int xorOperation(int n, int start) {
        int ans = 0;
        for(int i=0; i<n; i++) {
            int num = 2 * i + start;
            ans ^= num;
        }
        return ans;
    }
}
