package algorithm;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem1773 {

    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int ans = 0;
        Map<String, Integer> map = new HashMap<>();
        map.put("type", 0);
        map.put("color", 1);
        map.put("name", 2);
        int column = map.get(ruleKey);

        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).get(column).equals(ruleValue)) {
                ans++;
            }
        }

        return ans;
    }
}
