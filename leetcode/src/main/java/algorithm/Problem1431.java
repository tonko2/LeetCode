package algorithm;

import java.util.ArrayList;
import java.util.List;

public class Problem1431 {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandies = 0;
        for (int candy : candies) {
            maxCandies = Math.max(maxCandies, candy);
        }

        List<Boolean> ans = new ArrayList<>();
        for (int candy : candies) {
            ans.add(maxCandies <= candy + extraCandies);
        }
        return ans;
    }
}
