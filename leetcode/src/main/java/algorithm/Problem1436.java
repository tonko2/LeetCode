package algorithm;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem1436 {
    public String destCity(List<List<String>> paths) {
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < paths.size(); i++) {
            map.put(paths.get(i).get(0), paths.get(i).get(1));
        }

        String end = paths.get(0).get(1);

        while(true) {
            if (map.get(end) == null) {
                return end;
            }
            end = map.get(end);
        }
    }
}
