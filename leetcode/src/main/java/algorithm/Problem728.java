package algorithm;

import java.util.LinkedList;
import java.util.List;

public class Problem728 {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans = new LinkedList<>();
        for(int i=left; i<=right; i++) {
            if (isSelfDividingNumbers(i)) {
                ans.add(i);
            }
        }
        return ans;
    }

    boolean isSelfDividingNumbers(int x) {
        int original = x;
        while(x != 0) {
            int digit = x % 10;
            if (digit == 0 || original % digit != 0) {
                return false;
            }
            x /= 10;
        }
        return true;
    }
}
