package algorithm;

public class Problem1859 {
    public String sortSentence(String s) {
        String[] splited = s.split(" ");
        String[] strs = new String[splited.length];
        for (String s1 : splited) {
            int index = s1.charAt(s1.length() - 1) - '1';
            strs[index] = s1.substring(0, s1.length() - 1);
        }
        return String.join(" ", strs);
    }
}
