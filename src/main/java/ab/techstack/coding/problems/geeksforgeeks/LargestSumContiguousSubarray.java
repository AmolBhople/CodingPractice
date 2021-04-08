package ab.techstack.coding.problems.geeksforgeeks;

/**
 * Write an efficient program to find the sum of contiguous subarray within a one-dimensional array of numbers that has the largest sum.
 * https://www.geeksforgeeks.org/largest-sum-contiguous-subarray/
 */
public class LargestSumContiguousSubarray {

    public static int maxSubArraySum(int a[]){
        int maxSoFar = a[0];
        int maxEndingHere =0;
        for (int i:a) {
            maxEndingHere = maxEndingHere+ i;
            if(maxEndingHere < 0){
                maxEndingHere = 0;
            }else if(maxSoFar < maxEndingHere){
                maxSoFar = maxEndingHere;
            }
        }
        String s = "dsflkjndsjfndsf";
        String substring = s.substring(0, 1);
        String substring1 = s.substring(2);
        System.out.println(substring);
        System.out.println(substring1);
        return maxSoFar;
    }

    public static int maxSubArraySumPrintIndex(int a[]){
        int maxSoFar = a[0];
        int maxEndingHere =0, s=0, start=0, end = 0;
        for (int i = 0; i < a.length; i++) {
            maxEndingHere = maxEndingHere+ a[i];
            if(maxEndingHere < 0){
                maxEndingHere = 0;
                s = i + 1;
            }else if(maxSoFar < maxEndingHere){
                maxSoFar = maxEndingHere;
                start = s;
                end = i;
            }
        }

        System.out.println("Starting index " + start);
        System.out.println("Ending index " + end);
        return maxSoFar;
    }
}
