package algorithm;

public class Problem1021 {
    public String removeOuterParentheses(String S) {
        StringBuilder ans = new StringBuilder();
        int parenthesis = 0;
        for(int i=0; i<S.length(); i++) {
            if(S.charAt(i) == '(') {
                if (parenthesis != 0) {
                    ans.append(S.charAt(i));
                }
                parenthesis++;
            } else {
                parenthesis--;
                if (parenthesis != 0) {
                    ans.append(S.charAt(i));
                }
            }
        }
        return ans.toString();
    }
}
