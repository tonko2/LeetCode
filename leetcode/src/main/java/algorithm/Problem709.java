package algorithm;

public class Problem709 {
    public String toLowerCase(String str) {
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                ans.append((char) (str.charAt(i) + 32));
            } else {
                ans.append(str.charAt(i));
            }
        }
        return ans.toString();
    }
}
