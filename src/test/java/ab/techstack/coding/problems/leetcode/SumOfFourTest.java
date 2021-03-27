package ab.techstack.coding.problems.leetcode;

import ab.techstack.coding.problems.leetcode.SumOfFour;
import org.junit.jupiter.api.Test;

import java.util.List;

class SumOfFourTest {

    @Test
    void testSumOfFour(){

        int[] nums = new int[]{1,0,-1,0,-2,2};
        int target = 0;
        SumOfFour sumOfFour = new SumOfFour();
        List<List<Integer>> lists = sumOfFour.sumOfFour(nums, target);

        for(List<Integer> intarr:lists){
            intarr.stream().forEach((arr)-> System.out.print(arr+" "));
        }

        System.out.println("\n-----------------");
       nums = new int[]{};
         target = 0;
        lists = sumOfFour.sumOfFour(nums, target);
        for(List<Integer> intarr:lists){
            intarr.stream().forEach((arr)-> System.out.print(arr+" "));
        }
        System.out.println("\n-----------------");
        nums = new int[]{2, 7, 4, 0, 9, 5, 1, 3 };
        target = 20;
        lists = sumOfFour.sumOfFour(nums, target);
        for(List<Integer> intarr:lists){
            intarr.stream().forEach((arr)-> System.out.print(arr+" "));
        }


        System.out.println("\n-----------------");
        nums = new int[]{0,0,0,0};
        target = 0;
        lists = sumOfFour.sumOfFour(nums, target);
        for(List<Integer> intarr:lists){
            intarr.stream().forEach((arr)-> System.out.print(arr+" "));
        }

        System.out.println("\n-----------------");
        nums = new int[]{0,0,0};
        target = 0;
        lists = sumOfFour.sumOfFour(nums, target);
        for(List<Integer> intarr:lists){
            intarr.stream().forEach((arr)-> System.out.print(arr+" "));
        }

        System.out.println("\n-----------------");
        nums = new int[]{0,0,0,0, 0};
        target = 0;
        lists = sumOfFour.sumOfFour(nums, target);
        for(List<Integer> intarr:lists){
            intarr.stream().forEach((arr)-> System.out.print(arr+" "));
        }

        System.out.println("\n-----------------");
        nums = new int[]{0,0,0,0,0,0,0,0};
        target = 0;
        lists = sumOfFour.sumOfFour(nums, target);
        for(List<Integer> intarr:lists){
            intarr.stream().forEach((arr)-> System.out.print(arr+" "));
        }

        System.out.println("\n-----------------");
        nums = new int[]{-3,-2,-1,0,0,1,2,3};
        target = 0;
        lists = sumOfFour.sumOfFour(nums, target);
        for(List<Integer> intarr:lists){
            intarr.stream().forEach((arr)-> System.out.print(arr+" "));
        }
    }


}