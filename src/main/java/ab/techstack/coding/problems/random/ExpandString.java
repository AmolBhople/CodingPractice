package ab.techstack.coding.problems.random;

import java.util.Stack;

public class ExpandString {
    public static void main(String[] args) {
        ExpandString es = new ExpandString();
        System.out.println(es.expand("xy2(a3(bc))"));
    }

    public String expand(String s){
        String result = "";
        Stack<Character> stack1 = new Stack<>();
        Stack<Integer> digitStack = new Stack<>();
        char[] chars = s.toCharArray();
        for (char ch: chars) {
            if(Character.isDigit(ch)){
                digitStack.push(Character.digit(ch,10));
            }
            if(')' == ch){
                char pop = 0;
                StringBuilder sb = new StringBuilder();
                while(true){
                     pop = stack1.pop();
                     if('(' != pop){
                         sb.append(pop);
                     }else{
                         stack1.pop();
                         break;
                     }
                }
                StringBuilder reverse = sb.reverse();
                StringBuilder multi = new StringBuilder();

                Integer pop1 = digitStack.pop();
                for (int i = 0; i < pop1; i++) {
                    multi.append(reverse);
                }
                char[] multiCharArr = multi.toString().toCharArray();
                for (char multichar: multiCharArr
                     ) {
                    stack1.push(multichar);
                }
            }
            else{
                stack1.push(ch);
            }

        }
        StringBuilder stringBuilder = new StringBuilder();
        while (!stack1.isEmpty()){
            stack1.pop();
//            stringBuilder.append();
        }

        return stringBuilder.reverse().toString();
    }
}
