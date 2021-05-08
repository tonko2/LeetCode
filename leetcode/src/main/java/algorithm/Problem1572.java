package algorithm;

public class Problem1572 {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int ans = 0;
        for(int i=0; i<n; i++) {
            ans += mat[i][i] + mat[i][n-1-i];
        }
        if (n % 2 == 0) {
            ans -= mat[n/2][n/2];
        }
        return ans;
    }
}
