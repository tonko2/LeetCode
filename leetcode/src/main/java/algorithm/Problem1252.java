package algorithm;

public class Problem1252 {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] matrix = new int[n][m];

        for (int[] index : indices) {
            int i = index[0], j = index[1];
            for (int k = 0; k < m; k++) {
                matrix[i][k] += 1;
            }
            for (int k = 0; k < n; k++) {
                matrix[k][j] += 1;
            }
        }

        int ans = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (indices[i][j] % 2 == 1) {
                    ans++;
                }
            }
        }
        return ans;
    }
}
