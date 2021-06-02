package algorithm;

public class Problem852v2 {
    public int peakIndexInMountainArray(int[] arr) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if ((arr[mid] > arr[mid + 1]) && (arr[mid] > arr[mid - 1])) {
                return mid;
            } else if ((arr[mid] > arr[mid + 1]) && (arr[mid] < arr[mid -1])) {
                high = mid -1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
