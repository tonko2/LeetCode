package algorithm;

public class Problem1108 {
    public static String defangIPaddr(String address) {
        return address.replaceAll("\\.", "[.]");
    }
}
