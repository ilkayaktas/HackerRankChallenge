import java.util.Stack;

/**
 * Created by ilkayaktas on 2018-12-18 at 21:33.
 */

public class BalancedBrackets {
    // Complete the isBalanced function below.
    static String isBalanced(String s) {
        Stack<String> chs = new Stack<>();
        String[] sarr = s.split("");

        for (int i = 0; i < sarr.length; i++) {

            if(!chs.empty() && chs.peek().equals("{") && sarr[i].equals("}")){
                chs.pop();
            } else if(!chs.empty() && chs.peek().equals("(") && sarr[i].equals(")")){
                chs.pop();
            } else if(!chs.empty() && chs.peek().equals("[") && sarr[i].equals("]")){
                chs.pop();
            } else{
                chs.push(sarr[i]);
            }
        }

        return chs.size() == 0 ? "YES" : "NO";
    }
}
