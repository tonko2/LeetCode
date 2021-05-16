package algorithm;

import java.util.Arrays;

public class Problem1051 {
    public int heightChecker(int[] heights) {
        int[] sortedHeights = heights.clone();
        Arrays.sort(sortedHeights);
        int ans = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] !=  sortedHeights[i]) {
                ans++;
            }
        }
        return ans;
    }
}
