package algorithm;

public class Problem1299 {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int[] maxValues = new int[n];
        int maxValue = -1;
        for(int i=n-1; i>=0; i--) {
            maxValues[i] = maxValue;
            maxValue = Math.max(maxValue, arr[i]);
        }
        return maxValues;
    }
}
