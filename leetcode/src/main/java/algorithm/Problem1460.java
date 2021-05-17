package algorithm;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Problem1460 {
    public boolean canBeEqual(int[] target, int[] arr) {
        Arrays.sort(target);
        Arrays.sort(arr);
        return Arrays.equals(target, arr);
    }
}
