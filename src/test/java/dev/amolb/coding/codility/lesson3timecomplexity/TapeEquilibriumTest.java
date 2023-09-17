package dev.amolb.coding.codility.lesson3timecomplexity;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class TapeEquilibriumTest {

    @ParameterizedTest(name = "#{index} - Run test with args={0}")
    @MethodSource("argumentsProvider")
    void solution(int[] A, int result) {
        TapeEquilibrium solution =new TapeEquilibrium();
        assertEquals(result, solution.solution(A));
    }
    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                arguments(new int[]{3,1,2,4,3}, 1),
                arguments(new int[]{1,2}, 1),
                arguments(new int[]{6,3,9}, 0)
        );
    }
}