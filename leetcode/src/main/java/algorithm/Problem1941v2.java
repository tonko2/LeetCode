package algorithm;

public class Problem1941v2 {
    public boolean areOccurrencesEqual(String s) {
        int[] alphabet = new int[26];
        for (int i = 0; i < s.length(); i++) {
            alphabet[s.charAt(i) - 'a']++;
        }

        int prev = alphabet[s.charAt(0) - 'a'];

        for (int num : alphabet) {
            if (num != 0 && prev != num) {
                return false;
            }
        }
        return true;
    }
}
