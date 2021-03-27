package ab.techstack.coding.practice.junit;

/**
 * Created by AMOL BHOPLE.
 * Project: CodingPractice
 * Package: ab.techstack.coding.problems
 * Date: 3/9/2021
 * Time: 12:57 PM
 */
public class Demo {
    public static void main(String[] args) {
        System.out.println("Testing");
        Demo demo =new Demo();
        demo.testMethod("MyFirstTest");
    }
    public String testMethod(String testName){
        System.out.println("TestName = "+testName);
        return testName+"Complete";
    }

    public static int add(int a, int b){
        return a+b;
    }

    public static int[] checkArrSame(int arr[]){
        System.out.println("arr = "+arr);
        return arr;
    }
}
