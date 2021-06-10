package algorithm;

public class Problem1047v2 {
    public String removeDuplicates(String s) {
        char[] ans = new char[s.length()];
        int i = 0;
        for(int j=0; j<s.length(); j++) {
            char value = s.charAt(j);
            if (i > 0 && value == ans[i-1]) {
                i--;
            } else {
                ans[i++] = value;
            }
        }
        return new String(ans, 0, i);
    }
}
