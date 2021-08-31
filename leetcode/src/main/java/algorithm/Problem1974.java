package algorithm;

public class Problem1974 {
    public int minTimeToType(String word) {
        int ans = word.length();
        int pointer = 0;
        for (int i = 0; i < word.length(); i++) {
            int pos = word.charAt(i) - 'a';
            ans += Math.min(26 - pos, Math.abs(pos - pointer));
            pointer = pos;
        }
        return ans;
    }
}
