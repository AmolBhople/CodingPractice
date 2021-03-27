package ab.techstack.coding.practice.junit;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;
import static org.junit.jupiter.params.provider.EnumSource.Mode.EXCLUDE;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class DemoTest {


    @BeforeAll
    static void setup(){
        System.out.println("@BeforeAll executed");
    }

    @BeforeEach
    void setupThis(){
        System.out.println("@BeforeEach executed");
    }

    @AfterEach
    void tearThis(){
        System.out.println("@AfterEach executed");
    }

    @AfterAll
    static void tear(){
        System.out.println("@AfterAll executed");
    }



    @Tag("DEV")
    @Test
    void testCalcOne()
    {
        System.out.println("======TEST ONE EXECUTED=======");
        Assertions.assertEquals( 4 , Demo.add(2, 2));
    }

    @Tag("PROD")
    @Disabled
    @Test
    void testCalcTwo()
    {
        System.out.println("======TEST TWO EXECUTED=======");
        Assertions.assertEquals( 6 , Demo.add(2, 4));
    }



    @org.junit.jupiter.api.Test
    @DisplayName("Test with return value with 'complete', expected passed")
    void testMethod() {
        System.out.println("running test");

        Demo demo = new Demo();
//        String runningFromTEstClass = demo.testMethod("RunningFromTestClass");
//        System.out.println(runningFromTEstClass);
        Assertions.assertEquals("RunningFromTestClassComplete", demo.testMethod("RunningFromTestClass"));
        Assertions.assertNotEquals("RunningFromTestClass", demo.testMethod("RunningFromTestClass"));
    }

    @org.junit.jupiter.api.Test
    void testCase()
    {
        //Test will pass
        Assertions.assertNotEquals(3, Demo.add(2, 2));

        //Test will fail
        //Assertions.assertNotEquals(4, Demo.add(2, 2), "Calculator.add(2, 2) test failed");

        //Test will fail
        Supplier<String> messageSupplier  = ()-> "Calculator.add(2, 2) test failed";
        //Assertions.assertNotEquals(4, Demo.add(2, 2), messageSupplier);
    }


    @Test
    void testOnDev()
    {
        System.setProperty("ENV", "DEV");
        Assumptions.assumeTrue("DEV".equals(System.getProperty("ENV")), DemoTest::message);
    }

    @Test
    void testOnProd()
    {
        System.setProperty("ENV", "PROD");
        Assumptions.assumeFalse("DEV".equals(System.getProperty("ENV")));
    }

    private static String message () {
        return "TEST Execution Failed :: ";
    }

//
//    @ParameterizedTest(name = "#{index} - Test with TimeUnit: {0}")
//    @EnumSource(value = TimeUnit.class, names = {"MINUTES", "SECONDS"})
//    void test_timeunit_ok(TimeUnit time) {
//    }
//
//
//    @ParameterizedTest(name = "#{index} - Test with {0} and {1}")
//    @MethodSource("argumentProvider")
//    void test_method_multi(String str, int length) {
//    }
//
//    static Stream<Arguments> argumentProvider() {
//        return Stream.of(
//                arguments("abc", 3),
//                arguments("lemon", 2)
//        );
//    }

    @Test
    void testCheckArrSame(){
        int[] a= new int[]{1,2};
        assertEquals(a, Demo.checkArrSame(a));
    }



    // This test will run 3 times with different arguments
    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3})
    void test_int_arrays(int arg) {
        System.out.println("running with "+arg);
        assertTrue(arg > 0);
    }

    @ParameterizedTest(name = "#{index} - Run test with args={0}")
    @ValueSource(ints = {1, 2, 3})
    void test_int_arrays_custom_name(int arg) {
        assertTrue(arg > 0);
    }

    @ParameterizedTest(name = "#{index} - Run test with args={0}")
    @ValueSource(strings = {"apple", "banana", "orange"})
    void test_string_arrays_custom_name(String arg) {
        assertTrue(arg.length() > 1);
    }


//ValueSourceEmptyTest
    boolean isEmpty(String input) {
        return (input == null || input.length() == 0);
    }

    // run 3 times, 1 for empty, 1 for null, 1 for ""
    @ParameterizedTest(name = "#{index} - isEmpty()? {0}")
    @EmptySource
    @NullSource
    //@NullAndEmptySource
    @ValueSource(strings = {""})
    void test_is_empty_true(String arg) {
        assertTrue(isEmpty(arg));
    }

    @ParameterizedTest(name = "#{index} - isEmpty()? {0}")
    @ValueSource(strings = {" ", "\n", "a", "\t"})
    void test_is_empty_false(String arg) {
        System.out.println("incoming value="+arg+"-Done");
        assertFalse(isEmpty(arg));
    }


    enum Size {
        XXS, XS, S, M, L, XL, XXL, XXXL;
    }

    @ParameterizedTest
    @EnumSource(Size.class)
    void test_enum(Size size) {
        assertNotNull(size);
    }

    @ParameterizedTest(name = "#{index} - Is size contains {0}?")
    @EnumSource(value = Size.class, names = {"L", "XL", "XXL", "XXXL"})
    void test_enum_include(Size size) {
        assertTrue(EnumSet.allOf(Size.class).contains(size));
    }

    // Size = M, L, XL, XXL, XXXL
    @ParameterizedTest
    @EnumSource(value = Size.class, mode = EXCLUDE, names = {"XXS", "XS", "S"})
    void test_enum_exclude(Size size) {
        EnumSet<Size> excludeSmallSize = EnumSet.range(Size.M, Size.XXXL);
        assertTrue(excludeSmallSize.contains(size));
    }



//    MethodSourceTest

        @ParameterizedTest(name = "#{index} - Test with String : {0}")
        @MethodSource("stringProvider")
        void test_method_string(String arg) {
            assertNotNull(arg);
        }

        // this need static
        static Stream<String> stringProvider() {
            return Stream.of("java", "rust");
        }

        @ParameterizedTest(name = "#{index} - Test with Int : {0}")
        @MethodSource("rangeProvider")
        void test_method_int(int arg) {
            assertTrue(arg < 10);
        }

        // this need static
        static IntStream rangeProvider() {
            return IntStream.range(0, 10);
        }



//    MethodSourceMultiTest

        @ParameterizedTest
        @MethodSource("stringIntAndListProvider")
        void testWithMultiArgMethodSource(String str, int length, List<String> list) {
            assertTrue(str.length() > 0);
            assertEquals(length, list.size());
        }

        static Stream<Arguments> stringIntAndListProvider() {
            return Stream.of(
                    arguments("abc", 3, Arrays.asList("a", "b", "c")),
                    arguments("lemon", 2, Arrays.asList("x", "y"))
            );
        }

//    CsvSourceTest

        @ParameterizedTest
        @CsvSource({
                "java,      4",
                "clojure,   7",
                "python,    6"
        })
        void test_csv(String str, int length) {
            assertEquals(length, str.length());
        }



//    TimeOutExample1

//        // timed out after 5 seconds
//        @BeforeEach
//        @Timeout(5)
//        void setUpDB() throws InterruptedException {
//            //TimeUnit.SECONDS.sleep(10);
//        }
//
//        // timed out after 500 miliseconds
//        @Test
//        @Timeout(value = 500, unit = TimeUnit.MILLISECONDS)
//        void test_this() {
//        }

//    TimeOutExample2
//
//        // timed out after 5 seconds
//        @Test
//        void test_timeout_fail() {
//            // assertTimeout(Duration.ofSeconds(5), () -> delaySecond(10)); // this will fail
//
//            assertTimeout(Duration.ofSeconds(5), () -> delaySecond(1)); // pass
//        }
//
//        void delaySecond(int second) {
//            try {
//                TimeUnit.SECONDS.sleep(second);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }

//    ExceptionExample1

        @Test
        void test_exception() {

            Exception exception = assertThrows(
                    ArithmeticException.class,
                    () -> divide(1, 0));

            assertEquals("/ by zero", exception.getMessage());

            assertTrue(exception.getMessage().contains("zero"));

        }

        int divide(int input, int divide) {
            return input / divide;
        }
}