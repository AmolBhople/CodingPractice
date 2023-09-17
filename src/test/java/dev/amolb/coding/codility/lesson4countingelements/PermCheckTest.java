package dev.amolb.coding.codility.lesson4countingelements;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class PermCheckTest {

    @ParameterizedTest(name = "#{index} - Run test with args={0}")
    @MethodSource("argumentsProvider")
    void solution(int[] A, int result) {
        PermCheck solution =new PermCheck();
        assertEquals(result, solution.solution(A));
    }
    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                arguments(new int[]{4,1,2,3}, 1),
                arguments(new int[]{4,1,2}, 0),
                arguments(new int[]{3,4,2,6,1,5}, 1),
                arguments(new int[]{}, 1),
                arguments(new int[]{1}, 1),
                arguments(new int[]{3,4,2,6,1,5}, 1)
        );
    }
}