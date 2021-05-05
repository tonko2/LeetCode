package algorithm;

import java.util.HashSet;
import java.util.Set;

public class Problem804 {

    private static final String[] MORSE = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};

    public int uniqueMorseRepresentations(String[] words) {
        Set<String> ans = new HashSet<>();
        for (int i = 0; i < words.length; i++) {
            StringBuilder str = new StringBuilder();
            for (int j = 0; j < words[i].length(); j++) {
                str.append(MORSE[words[i].charAt(j) - 'a']);
            }
            ans.add(str.toString());
        }
        return ans.size();
    }
}
