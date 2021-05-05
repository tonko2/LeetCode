package algorithm;

public class Problem1816 {
    public String truncateSentence(String s, int k) {
        StringBuilder ans = new StringBuilder();
        String[] words = s.split(" ");
        for(int i=0; i<k; i++) {
            if (i != 0){
                ans.append(" ");
            }
            ans.append(words[i]);
        }
        return ans.toString();
    }
}
