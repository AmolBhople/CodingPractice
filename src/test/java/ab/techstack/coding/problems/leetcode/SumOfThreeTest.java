package ab.techstack.coding.problems.leetcode;

import ab.techstack.coding.problems.leetcode.SumOfThree;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class SumOfThreeTest {

   @Test
    void getSumOfThree(){
       SumOfThree sumOfThree = new SumOfThree();
       int[] nums = new int[]{-1,0,1,2,-1,-4};
       Integer[] arr1 = new Integer[]{-1,2,-1};
       Integer[] arr2 = new Integer[]{0,1,-1};
       List<Integer[]> expectedOut = new ArrayList<>();
       expectedOut.add(arr1);
       expectedOut.add(arr2);
       List<List<Integer>>  output = null;

               output = sumOfThree.get3NumberWhoseSumIsZero(nums);
       printArr(nums);

       for(List<Integer> intarr:output){
           intarr.stream().forEach((arr)-> System.out.print(arr+" "));
       }
       System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");


       nums = new int[]{15,-8,-7,2,-1,-4};
       printArr(nums);
       arr1 =  new Integer[]{15,-8,-7};
       expectedOut = new ArrayList<>();
       expectedOut.add(arr1);

       output = sumOfThree.get3NumberWhoseSumIsZero(nums);
       for(List<Integer> intarr:output){
           intarr.stream().forEach((arr)-> System.out.print(arr+" "));
       }
//
//
//
       System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
      nums = new int[]{7, 12, 3, 1, 2, -6, 5, -8, 6};
       printArr(nums);
//      int [][]arr3 = new int[][]{{2, -8, 6}, {3, 5, -8}, {1, -6, 5}};
//      expectedOut = new Object[1];
//      expectedOut[0]=arr3;
//      output = sumOfThree.get3NumberWhoseSumIsZero(nums);
       output = sumOfThree.get3NumberWhoseSumIsZero(nums);
       for(List<Integer> intarr:output){
           intarr.stream().forEach((arr)-> System.out.print(arr+" "));
       }
       System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
//
//
       nums = new int[]{};
       printArr(nums);
//       expectedOut = new Object[0];
//       output = sumOfThree.get3NumberWhoseSumIsZero(nums);
//       assertArrayEquals(expectedOut, output);
       output = sumOfThree.get3NumberWhoseSumIsZero(nums);
       for(List<Integer> intarr:output){
           intarr.stream().forEach((arr)-> System.out.print(arr+" "));
       }
       System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
//
       nums = new int[]{0};
       printArr(nums);
//       expectedOut = new Object[0];
//       output = sumOfThree.get3NumberWhoseSumIsZero(nums);
//       assertArrayEquals(expectedOut, output);
       output = sumOfThree.get3NumberWhoseSumIsZero(nums);
       for(List<Integer> intarr:output){
           intarr.stream().forEach((arr)-> System.out.print(arr+" "));
       }
       System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");


       nums = new int[]{0,0,0,0};
       printArr(nums);
       output = sumOfThree.get3NumberWhoseSumIsZero(nums);
       for(List<Integer> intarr:output){
           intarr.stream().forEach((arr)-> System.out.print(arr+" "));
       }
       System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

       nums = new int[]{0,0,0};
       printArr(nums);
       output = sumOfThree.get3NumberWhoseSumIsZero(nums);
       for(List<Integer> intarr:output){
           intarr.stream().forEach((arr)-> System.out.print(arr+" "));
       }
       System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

       nums = new int[]{0,2,2,3,0,1,2,3,-1,-4,2};
       printArr(nums);
       output = sumOfThree.get3NumberWhoseSumIsZero(nums);
       for(List<Integer> intarr:output){
           intarr.stream().forEach((arr)-> System.out.print(arr+" "));
       }
       System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");



   }



   public void printArr(int[] nums){
       System.out.print("Input=> ");
       Arrays.stream(nums).forEach((arr)-> System.out.print(arr+" "));
       System.out.println("");
   }

}