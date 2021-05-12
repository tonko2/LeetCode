package algorithm;

public class Problem1728 {
    public String mergeAlternately(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        char[] ans = new char[n + m];
        int index = 0;
        int index1 = 0;
        int index2 = 0;
        while(index1 < n || index2 < m) {
            if (index1 < n) {
                ans[index++] = word1.charAt(index1++);
            }

            if (index2 < m) {
                ans[index++] = word2.charAt(index2++);
            }
        }
        return String.valueOf(ans);
    }
}
