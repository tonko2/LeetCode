package algorithm;

public class Problem1342 {
    public int numberOfSteps(int num) {
        int ans = 0;
        while(num > 0) {
            num = num % 2 == 0 ? num / 2 : num - 1;
            ans++;
        }
        return ans;
    }
}
