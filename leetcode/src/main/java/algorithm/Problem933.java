package algorithm;

import java.util.TreeMap;

public class Problem933 {
    TreeMap<Integer, Integer> treeMap;

    public Problem933() {
        treeMap = new TreeMap<>();
    }

    public int ping(int t) {
        treeMap.put(t, 1 + treeMap.size());
        return treeMap.tailMap(t - 3000).size();
    }
}
