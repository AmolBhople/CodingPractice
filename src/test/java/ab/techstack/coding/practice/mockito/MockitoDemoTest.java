package ab.techstack.coding.practice.mockito;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class MockitoDemoTest {

    @Test
    public void testAdd(){
        MockitoDemo demo =new MockitoDemo();
        assertEquals("testNameComplete", demo.testMethod("testName"));
    }
}