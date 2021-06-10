package algorithm;

public class Problem1047 {
    public String removeDuplicates(String s) {
        StringBuilder ans = new StringBuilder(s);
        boolean change = true;
        while(change) {
            change = false;
            StringBuilder next = new StringBuilder();
            for(int i=0; i<ans.length(); i++) {
                if (i+1 < ans.length() && ans.charAt(i) == ans.charAt(i+1)) {
                    change = true;
                    i++;
                } else {
                    next.append(ans.charAt(i));
                }
            }
            ans = next;
        }
        return ans.toString();
    }
}
