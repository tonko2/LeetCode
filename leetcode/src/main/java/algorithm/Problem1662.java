package algorithm;

public class Problem1662 {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder words1 = new StringBuilder();
        for (int i = 0; i < word1.length; i++) {
            words1.append(word1[i]);
        }

        StringBuilder words2 = new StringBuilder();
        for (int i = 0; i < word2.length; i++) {
            words2.append(word2[i]);
        }

        return words1.toString().equals(words2.toString());
    }
}
