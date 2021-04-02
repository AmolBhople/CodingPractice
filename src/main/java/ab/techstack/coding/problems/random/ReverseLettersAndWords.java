package ab.techstack.coding.problems.random;

import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class ReverseLettersAndWords {

    public static final Pattern PATTERN = Pattern.compile(" +");

    public String reverseLettersOfEachWord(String line){

        return PATTERN.splitAsStream(line)
                .map(word -> new StringBuilder(word).reverse())
                .collect(Collectors.joining(" "));

    }
    public String reverseLettersAndWords(String line){
        return new StringBuilder(line).reverse().toString();
    }
}
