package algorithm;

public class Problem9 {
    public boolean isPalindrome(int x) {
        int target = x;
        int sum = 0;

        while(x > 0) {
            sum = sum * 10 + x % 10;
            x /= 10;
        }

        return target == sum;
    }
}
