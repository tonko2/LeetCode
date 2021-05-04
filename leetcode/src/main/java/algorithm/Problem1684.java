package algorithm;

public class Problem1684 {
    public int countConsistentStrings(String allowed, String[] words) {
        boolean[] allowedList = new boolean[26];
        for (int i = 0; i < allowed.length(); i++) {
            allowedList[allowed.charAt(i) - 'a'] = true;
        }

        int ans = 0;
        for (String word : words) {
            boolean consistent = true;
            for (int j = 0; j < word.length(); j++) {
                if (!allowedList[word.charAt(j) - 'a']) {
                    consistent = false;
                    break;
                }
            }
            ans = consistent ? ans + 1 : ans;
        }
        return ans;
    }
}
