package dev.amolb.coding.codility.lesson4countingelements;

import dev.amolb.coding.codility.lesson3timecomplexity.TapeEquilibrium;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class FrogRiverOneTest {
    @ParameterizedTest(name = "#{index} - Run test with args={0}")
    @MethodSource("argumentsProvider")
    void solution(int X, int[] A, int result) {
        FrogRiverOne solution =new FrogRiverOne();
        assertEquals(result, solution.solution(X, A));
    }
    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                arguments(5, new int[]{1,3,1,4,2,3,5,4}, 6),
                arguments(7, new int[]{1,3,1,4,2,3,5,4,6,7}, 9),
                arguments(7, new int[]{1,3,1,4,2,3,6,7}, -1)

                );
    }
}