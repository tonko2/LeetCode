package algorithm;

public class Problem1672 {
    public int maximumWealth(int[][] accounts) {
        int maxSum = 0;
        for(int i=0; i<accounts.length; i++) {
            int sum = 0;
            for (int j=0; j<accounts[i].length; j++) {
                sum += accounts[i][j];
            }
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
}
