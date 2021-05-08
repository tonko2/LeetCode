package algorithm;

public class Problem1309 {
    public String freqAlphabets(String s) {
        StringBuilder ans = new StringBuilder();
        for(int i=s.length()-1; i>=0; i--) {
            if (s.charAt(i) == '#') {
                int plus = Integer.valueOf(s.substring(i-2, i));
                ans.append((char)('a' + plus));
                i-=2;
            } else {
                ans.append((char)('a' + (s.charAt(i) - '1')));
            }
        }
        return ans.reverse().toString();
    }
}
