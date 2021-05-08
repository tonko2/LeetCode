package algorithm;

public class Problem1323 {
    public int maximum69Number (int num) {
        String str = String.valueOf(num);
        StringBuilder ans = new StringBuilder();
        boolean change = false;
        for(int i=0; i<str.length(); i++) {
            if (!change && str.charAt(i) == '6') {
                change = true;
                ans.append('9');
            } else {
                ans.append(str.charAt(i));
            }
        }
        return Integer.valueOf(ans.toString());
    }
}
