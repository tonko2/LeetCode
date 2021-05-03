package algorithm;

public class Problem1221 {
    public int balancedStringSplit(String s) {
        int ans = 0, left = 0, right = 0;
        for(int i=0; i<s.length(); i++) {
            if (s.charAt(i) == 'L') {
                left++;
            } else {
                right++;
            }

            if (left == right) {
                ans++;
            }
        }
        return ans;
    }
}
