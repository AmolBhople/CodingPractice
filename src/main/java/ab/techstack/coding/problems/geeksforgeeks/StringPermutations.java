package ab.techstack.coding.problems.geeksforgeeks;

import java.util.Arrays;

/**
 * Print all permutations of a string in Java

 * Given a string str, the task is to print all the permutations of str. A permutation is an arrangement of all or part of a set of objects, with regard to the order of the arrangement. For instance, the words ‘bat’ and ‘tab’ represents two distinct permutation (or arrangements) of a similar three letter word.
 */
public class StringPermutations {
    public void printPermutations(String string, String answer){
        if(string.length() == 0){
            System.out.println(answer+" ");
            return;
        }
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            //keep ch out of string
            String part1 = string.substring(0, i) + string.substring(i + 1);
            printPermutations(part1, answer+ch);

        }
    }

    public void printDistinctPermutations(String string, String answer){
        if(string.length() == 0){
            System.out.print(answer+" ");
            return;
        }
        boolean[] alphabets = new boolean[26];
//        Arrays.fill(alphabets, false);
        for (int i = 0; i < string.length(); i++) {

            char ch = string.charAt(i);
            //keep ch out of string
            String part1 = string.substring(0, i) + string.substring(i + 1);

            if(alphabets[ch - 'a'] == false)
                printDistinctPermutations(part1, answer + ch);
            alphabets[ch - 'a'] = true;

        }
    }
}
