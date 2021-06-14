package algorithm;

public class Problem1880 {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        return convertToNum(firstWord) + convertToNum(secondWord) == convertToNum(targetWord);
    }

    private int convertToNum(String str) {
        int res = 0;
        for(int i=0; i<str.length(); i++) {
            res *= 10;
            res += str.charAt(i) - 'a';
        }
        return res;
    }
}
