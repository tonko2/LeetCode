package algorithm;

public class Problem1337 {
    public int[] kWeakestRows(int[][] mat, int k) {
        int n = mat.length;
        int m = mat[0].length;
        boolean[][] arr = new boolean[n][101];
        for(int i=0; i<n; i++) {
            int count = 0;
            for(int j=0; j<m; j++) {
                if (mat[i][j] == 1) {
                    count++;
                } else {
                    break;
                }
            }
            arr[i][count] = true;
        }

        int[] ans = new int[k];
        int index = 0;
        for(int i=0; i<=100; i++) {
            for(int j=0; j<n; j++) {
                if (arr[j][i]) {
                    ans[index++] = j;
                }
                if (index == k) {
                    break;
                }
            }
            if (index == k) {
                break;
            }
        }
        return ans;
    }
}
