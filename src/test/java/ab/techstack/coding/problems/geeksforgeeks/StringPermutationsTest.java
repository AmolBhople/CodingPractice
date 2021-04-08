package ab.techstack.coding.problems.geeksforgeeks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringPermutationsTest {

    @Test
    void printPermutations() {
        StringPermutations stringPermutations = new StringPermutations();
        stringPermutations.printPermutations("abb", "");
    }

    @Test
    void printDistinctPermutations() {
        StringPermutations stringPermutations = new StringPermutations();
        stringPermutations.printDistinctPermutations("xxd", "");
    }
}