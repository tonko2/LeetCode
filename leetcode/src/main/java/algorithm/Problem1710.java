package algorithm;

public class Problem1710 {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int sum = 0;
        for(int i=0; i<boxTypes.length; i++) {
            int boxes = 0;
            int units = 0;
            int index = 0;
            for(int j=0; j<boxTypes.length; j++) {
                if (boxTypes[j][0] <= 0) {
                    continue;
                }
                if (units < boxTypes[j][1]) {
                    boxes = boxTypes[j][0];
                    units = boxTypes[j][1];
                    index = j;
                }
            }
            truckSize -= boxes;
            if (truckSize <= 0) {
                sum += units * (boxes + truckSize);
                break;
            } else {
                sum += units * boxes;
            }
            boxTypes[index][0] = 0;
        }
        return sum;
    }
}
