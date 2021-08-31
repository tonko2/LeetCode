package algorithm;

import java.util.HashMap;
import java.util.Map;

public class Problem1935 {
    public int canBeTypedWords(String text, String brokenLetters) {
        Map<Character, Boolean> map = new HashMap<>();

        for (int i = 0; i < brokenLetters.length(); i++) {
            map.put(brokenLetters.charAt(i), true);
        }

        String[] strs = text.split(" ");
        int ans = strs.length;
        for (int i = 0; i < strs.length; i++) {
            for (int j = 0; j < strs[i].length(); j++) {
                if (map.getOrDefault(strs[i].charAt(j), false)) {
                    ans--;
                    break;
                }
            }
        }
        return ans;
    }
}
