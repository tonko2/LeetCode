package algorithm;

import java.util.Arrays;

public class Problem557 {
    public String reverseWords(String s) {
        String[] splitedWords = s.split(" ");
        for(int i=0; i<splitedWords.length; i++) {
            splitedWords[i] = reverse(splitedWords[i]);
        }
        return String.join(" ", splitedWords);
    }

    private String reverse(String s) {
        char[] res = new char[s.length()];
        for(int i=0; i<s.length(); i++) {
            res[i] = s.charAt(s.length() - i - 1);
        }
        return String.valueOf(res);
    }
}
