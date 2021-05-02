package algorithm;

public class Problem1678 {
    public String interpret(String command) {
        command = command.replace("()", "o");
        StringBuilder ans  = new StringBuilder();
        for(int i=0; i<command.length(); i++) {
            if (command.charAt(i) == '(' || command.charAt(i) == ')') {
                continue;
            }
            ans.append(command.charAt(i));
        }
        return ans.toString();
    }
}
