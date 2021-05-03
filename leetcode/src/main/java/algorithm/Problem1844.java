package algorithm;

public class Problem1844 {
    public String replaceDigits(String s) {
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                ans.append(s.charAt(i));
            } else {
                char base = s.charAt(i - 1);
                int shift = s.charAt(i) - '0';

                ans.append((char) (base + shift));
            }
        }
        return ans.toString();
    }
}
