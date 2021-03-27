package ab.techstack.coding.problems.leetcode;

import java.util.EmptyStackException;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 *
 * An input string is valid if:
 *
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 *
 */
public class ValidParentheses {

    public static Map<Character, Character> paranthesisMap = new HashMap<Character, Character>();

    public ValidParentheses(){
        paranthesisMap.put(')', '(');
        paranthesisMap.put('}', '{');
        paranthesisMap.put(']', '[');
    }

    public boolean isValid(String s) {
        boolean result=false;
        if(s !=null && s.length()>=1) {
            try {
                Stack<Character> stack = new Stack<>();
                for (Character c : s.toCharArray()) {
                    if (paranthesisMap.containsKey(c)) {
                        Character pop = stack.pop();
                        result = pop.equals(paranthesisMap.get(c));
                        if (!result){
                            break;
                        }
                    }else{
                        stack.push(c);
                    }
                }
                return result && stack.isEmpty();
            } catch (EmptyStackException e) {
                result=false;
            }
        }
        return result;
    }
}
