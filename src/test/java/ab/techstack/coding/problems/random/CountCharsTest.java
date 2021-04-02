package ab.techstack.coding.problems.random;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Map;

class CountCharsTest {
    CountChars countChars = new CountChars();

    @ParameterizedTest(name = "#{index} - Run test with args={0}")
    @ValueSource(strings = {"apple", "banana", "orange"})
    void countDuplicateCharsUsingMap(String arg) {
        Map<Character, Long> characterLongMap = countChars.countCharsUsingMap(arg);
        characterLongMap.forEach((k,v)-> System.out.println("k="+k+" v="+v));
        System.out.println("-----");
    }

    @ParameterizedTest(name = "#{index} - Run test with args={0}")
    @ValueSource(strings = {"apple", "banana", "orange"})
    void countDuplicateCharsUsingStreams(String arg) {
        Map<Character, Long> characterLongMap = countChars.countCharsUsingMap(arg);
        characterLongMap.forEach((k,v)-> System.out.println("k="+k+" v="+v));
        System.out.println("-----");
    }

}