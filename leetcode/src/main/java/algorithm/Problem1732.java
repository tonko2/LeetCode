package algorithm;

public class Problem1732 {
    public int largestAltitude(int[] gain) {
        int ans = 0;
        int altitude = 0;
        for (int value : gain) {
            altitude += value;
            ans = Math.max(ans, altitude);
        }
        return ans;
    }
}
