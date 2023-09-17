package dev.amolb.coding.codility.lesson3timecomplexity;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class FrogJumpTest {

//    @Test
    @ParameterizedTest(name = "#{index} - Run test with args={0}")
    @MethodSource("argumentsProvider")
    void solution(int startingPosition, int endPosition, int jumpDistance, int totalJump) {
        FrogJump frogJump =new FrogJump();
        assertEquals(totalJump, frogJump.solution(startingPosition, endPosition, jumpDistance));
    }
    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                arguments(10,85,30,3),
                arguments(10,155,30,5),
                arguments(1,8,1,7),
                arguments(0,8,2,4),
                arguments(10,85,40,2),
                arguments(10,155,40,4)
        );
    }
}