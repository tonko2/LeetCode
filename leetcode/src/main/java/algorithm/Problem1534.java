package algorithm;

public class Problem1534 {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int ans = 0;
        int n = arr.length;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if (Math.abs(arr[i] - arr[j]) > a) {
                    continue;
                }
                for(int k=j+1; k<n; k++) {
                    if (Math.abs(arr[j] - arr[k]) <= b && Math.abs(arr[i] - arr[k]) <= c) {
                        ans++;
                    }
                }
            }
        }
        return ans;
    }
}
