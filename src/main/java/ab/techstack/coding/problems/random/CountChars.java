package ab.techstack.coding.problems.random;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CountChars {

    public Map<Character, Long> countCharsUsingMap(String input) {
        Map<Character, Long> result = new HashMap<>();
        for (Character c : input.toCharArray()) {

            result.compute(c, (k, v) -> (v == null) ? 1 : ++v);
        }
        return result;
    }

    public Map<Character, Long> countCharsUsingStreams(String input) {
        Map<Character, Long> result = input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c->c,Collectors.counting()));
        return result;
    }
}
