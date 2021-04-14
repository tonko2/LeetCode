package algorithm;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] ans = Problem1480.runningSum(nums);
        for(int i=0; i<ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
}
