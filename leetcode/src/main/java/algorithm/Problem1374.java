package algorithm;

import java.util.Collections;

public class Problem1374 {
    public String generateTheString(int n) {
        if (n % 2 == 1) {
            return String.join("", Collections.nCopies(n, "a"));
        } else {
            return "b" + String.join("", Collections.nCopies(n - 1, "a"));
        }
    }
}
