package algorithm;

public class Problem461 {
    public int hammingDistance(int x, int y) {
        int xy = x ^ y;
        int ans = 0;
        while(xy != 0) {
            if (xy % 2 == 1) {
                ans++;
            }
            xy /= 2;
        }
        return ans;
    }
}
