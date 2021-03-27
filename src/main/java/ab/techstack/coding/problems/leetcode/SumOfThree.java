package ab.techstack.coding.problems.leetcode;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Stream;

/**
 * Created by AMOL BHOPLE.
 * Project: CodingPractice
 * Package: ab.techstack.coding.problems
 * Date: 3/10/2021
 * Time: 2:03 PM
 */
public class SumOfThree {
    public List<List<Integer>>  get3NumberWhoseSumIsZero(int[] nums) {
        List<List<Integer>> outList = new ArrayList<>();
        if(nums == null || nums.length <3){
            return outList;
        }
        Arrays.sort(nums);
        for (int i = 0; i<nums.length; i++) {
            int zeroCompl = 0 - nums[i];
            Set<Integer> complimentSet = new HashSet<>();
            for (int j = i + 1; j < nums.length; j++) {
                int compliment = zeroCompl - nums[j];
                if (complimentSet.contains(compliment)) {
                    List<Integer> arrList = new ArrayList<>(3);
                    arrList.add(nums[i]);
                    arrList.add(nums[j]);
                    arrList.add(compliment);
                   if( !outList.contains(arrList)) {
                       outList.add(arrList);
                   }
                } else {
                    complimentSet.add(nums[j]);
                }
            }
        }
        return outList;
    }
}
