package algorithm;

import java.util.HashMap;
import java.util.Map;

public class Problem1725 {
    public int countGoodRectangles(int[][] rectangles) {
        int ans = 0;
        int maxL = 0;
        for(int i=0; i<rectangles.length; i++) {
            maxL = Math.max(maxL, Math.min(rectangles[i][0], rectangles[i][1]));
        }
        for(int i=0; i<rectangles.length; i++) {
            if (Math.min(rectangles[i][0], rectangles[i][1]) == maxL) {
                ans++;
            }
        }
        return ans;
    }
}
