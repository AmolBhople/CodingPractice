package ab.techstack.coding.problems.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by AMOL BHOPLE.
 * Project: CodingPractice
 * Package: ab.techstack.coding.problems
 * Date: 3/10/2021
 * Time: 10:47 AM
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i =0; i<nums.length; i++){
            int complement = target - nums[i];
            if( map.containsKey(complement )){
                 return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        return null;
    }

    public boolean hasTwoSome(int[] nums, int target) {
        Set<Integer> complimentSet = new HashSet<>();
        for(int num:nums) {
            int compliment = target-num;
            if(complimentSet.contains(Integer.valueOf(num))){
                return true;
            }else{
                complimentSet.add(compliment);
            }
        }
        return false;
    }
}
