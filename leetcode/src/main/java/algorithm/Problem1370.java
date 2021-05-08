package algorithm;

public class Problem1370 {
    public String sortString(String s) {
        char[] cnt = new char[26];
        for (int i = 0; i < s.length(); i++) {
            cnt[s.charAt(i) - 'a']++;
        }

        StringBuilder ans = new StringBuilder();

        while (true) {
            boolean exist = false;
            for (int i = 0; i < 26; i++) {
                if (cnt[i] > 0) {
                    exist = true;
                    cnt[i]--;
                    ans.append((char) ('a' + i));
                }
            }
            for (int i = 25; i >= 0; i--) {
                if (cnt[i] > 0) {
                    exist = true;
                    cnt[i]--;
                    ans.append((char) ('a' + i));
                }
            }
            if (!exist) {
                break;
            }
        }
        return ans.toString();
    }
}
