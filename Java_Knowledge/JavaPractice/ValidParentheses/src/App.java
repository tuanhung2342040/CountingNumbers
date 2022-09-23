import java.util.Stack;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(isValid("{()}"));
    }
    /* Balanced parens
     * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', 
     * determine if the input string is valid.
    An input string is valid if:

    Open brackets must be closed by the same type of brackets.
    Open brackets must be closed in the correct order.
    Every close bracket has a corresponding open bracket of the same type.
     */
    public static boolean isValid(String s){
        Stack<Character> leftChars = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            // push left brackets
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                leftChars.push(s.charAt(i));
            }
            else{
                // unmatched right char
                // ())
                if(leftChars.isEmpty()){
                    return false;
                }
                // unsure match
                if( s.charAt(i) ==')' && leftChars.peek() != '(' ||
                    s.charAt(i) == ']' && leftChars.peek() != '[' ||
                    s.charAt(i) == '}' && leftChars.peek() != '{'){
                        return false;
                }
                // true: pop the top of the stack
                leftChars.pop();
            }
        }
        // in case unmatched left
        return leftChars.isEmpty();
    }
  

}
