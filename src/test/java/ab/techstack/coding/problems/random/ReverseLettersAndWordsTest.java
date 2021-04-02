package ab.techstack.coding.problems.random;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseLettersAndWordsTest {

    ReverseLettersAndWords reverseLettersAndWords = new ReverseLettersAndWords();
    @Test
    void reverseLettersOfEachWord() {
        assertEquals("olleH dlroW", reverseLettersAndWords.reverseLettersOfEachWord("Hello World"));
    }

    @Test
    void reverseLettersAndWords() {
        assertEquals("dlroW olleH", reverseLettersAndWords.reverseLettersAndWords("Hello World"));
    }
}