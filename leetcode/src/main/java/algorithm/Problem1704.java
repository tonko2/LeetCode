package algorithm;

public class Problem1704 {
    private static final char[] VOWELS = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};

    public boolean halvesAreAlike(String s) {
        int cnt = 0;
        for (int i = 0; i < s.length() / 2; i++) {
            if (isVowels(s.charAt(i))) {
                cnt++;
            }
        }

        for(int i=s.length() / 2; i < s.length(); i++) {
            if (isVowels(s.charAt(i))) {
                cnt--;
            }
        }
        return cnt == 0;
    }

    private boolean isVowels(char c) {
        for(int i=0; i<VOWELS.length; i++) {
            if (c == VOWELS[i]) {
                return true;
            }
        }
        return false;
    }
}
