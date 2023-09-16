package ab.techstack.coding.problems.random;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExpandStringTest {

    ExpandString es = new ExpandString();

    @Test
    void expand1() {
        assertEquals("aaaa", es.expand("4a"));
    }

    @Test
    void expand2() {
        assertEquals("xyabcbcbcabcbcbc", es.expand("xy2(a3(bc))"));
    }


    @Test
    void expand3() {
        assertEquals("xxxyyabccbccbccabccbccbcc", es.expand("3x2y2(a3(b2c))"));
    }


    @Test
    void expand4() {
        assertEquals("xyabcbcbctabcbcbct", es.expand("xy2(a3(bc)t)"));
    }
    @Test
    void expand5() {
        assertEquals("xyabcbcbctabcbcbctrro", es.expand("xy2(a3(bc)t)2ro"));
    }
    @Test
    void expan6() {
        assertEquals("xyabcbcbctabcbcbctrrodede", es.expand("xy2(a3(bc)t)2ro2(de)"));
    }
}