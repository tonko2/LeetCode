package algorithm;

import java.util.Arrays;
import java.util.Comparator;

public class Problem1356 {
    class MyCmp implements Comparator<int[]> {
        public int compare(int[] a, int[] b) {
            if(a[1] != b[1]) {
                return a[1]-b[1];
            } else {
                return a[0]-b[0];
            }
        }
    }

    public int[] sortByBits(int[] arr) {
        int[][] ans = new int[arr.length][2];
        for(int i=0; i<arr.length; i++) {
            ans[i][0] = arr[i];
            ans[i][1] = Integer.bitCount(arr[i]);
        }
        Arrays.sort(ans, new MyCmp());
        for(int i=0; i<arr.length; i++) {
            arr[i] = ans[i][0];
        }
        return arr;
    }
}
