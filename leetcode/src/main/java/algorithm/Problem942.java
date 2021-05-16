package algorithm;

public class Problem942 {
    public int[] diStringMatch(String s) {
        int n = s.length();
        int left = 0, right = n;
        int[] result = new int[n + 1];

        int index = 0;
        for (char c : s.toCharArray()) {
            if (c == 'I') {
                result[index++] = left++;
            } else {
                result[index++] = right--;
            }
        }
        result[n] = right;

        return result;
    }
}
