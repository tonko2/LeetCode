package algorithm;

public class Problem1614 {
    public int maxDepth(String s) {
        int ans = 0, left = 0;
        for(int i=0; i<s.length(); i++) {
            if (s.charAt(i) == '(') {
                left++;
            }
            if (s.charAt(i) == ')') {
                left--;
            }
            ans = Math.max(ans, left);
        }
        return ans;
    }
}
