package dev.amolb.coding.codility.lesson3timecomplexity;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class PermMissingElemTest {

    @Test
    void solution() {
    }
    @ParameterizedTest(name = "#{index} - Run test with args={0}")
    @MethodSource("argumentsProvider")
    void solution(int[] A, int result) {
        PermMissingElem solution =new PermMissingElem();
        assertEquals(result, solution.solution(A));
    }
    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                arguments(new int[]{2,3,1,5}, 4),
                arguments(new int[]{2,3,1,5,6}, 4),
                arguments(new int[]{2,3,1,5,4}, 6),
                arguments(new int[]{}, 1)
        );
    }

}