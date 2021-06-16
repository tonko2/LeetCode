package algorithm;

public class Problem1710v2 {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int[] box = new int[1001];
        for (int[] boxType : boxTypes) {
            box[boxType[1]] += boxType[0];
        }

        int sum = 0;
        for(int i=box.length-1; i>=1; i--) {
            if (box[i] == 0) {
                continue;
            }
            sum += i * box[i];
            truckSize -= box[i];
            if (truckSize <= 0) {
                sum += truckSize * i;
                break;
            }
        }
        return sum;
    }
}
