package algorithm;

public class Problem1832 {
    public static boolean checkIfPangram(String sentence) {
        boolean appearAlphabet[] = new boolean[26];
        int cnt = 0;
        for (int i = 0; i < sentence.length(); i++) {
            int index = sentence.charAt(i) - 'a';
            if (!appearAlphabet[index]) {
                cnt++;
            }
            appearAlphabet[index] = true;
        }
        return cnt == 26;
    }
}
