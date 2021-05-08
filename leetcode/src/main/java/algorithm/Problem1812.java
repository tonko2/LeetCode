package algorithm;

public class Problem1812 {
    public boolean squareIsWhite(String coordinates) {
        int x = coordinates.charAt(0) - 'a';
        int y = coordinates.charAt(1) - '1';
        if (x % 2 == 0) {
            return y % 2 != 0;
        } else {
            return y % 2 == 0;
        }
    }
}
