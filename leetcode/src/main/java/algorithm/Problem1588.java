package algorithm;

public class Problem1588 {
    public int sumOddLengthSubarrays(int[] arr) {
        int[] arrSum = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            arrSum[i + 1] = arrSum[i] + arr[i];
        }

        int ans = 0;
        for (int i = 1; i <= arr.length; i += 2) {
            for (int j = 0; j < arr.length && i + j <= arr.length; j++) {
                ans += arrSum[i + j] - arrSum[j];
            }
        }
        return ans;
    }
}
