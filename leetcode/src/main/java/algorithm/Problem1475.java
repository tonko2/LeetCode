package algorithm;

public class Problem1475 {
    public int[] finalPrices(int[] prices) {
        int n = prices.length;
        int[] ans = new int[n];
        for(int i=0; i<n; i++) {
            int discount = 0;
            for(int j=i+1; j<n; j++) {
                if (prices[i] >= prices[j]) {
                    discount = prices[j];
                    break;
                }
            }
            ans[i] = prices[i] - discount;
        }
        return ans;
    }
}
