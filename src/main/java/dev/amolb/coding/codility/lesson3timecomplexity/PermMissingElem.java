package dev.amolb.coding.codility.lesson3timecomplexity;

public class PermMissingElem {
    public int solution(int[] A) {

        // Using the concept of "Sum = (ceiling + floor) * height /2"
        // So---> Sum = (1 + N+1) * N /2
        // the missing element can be found by minus other elements
        long end = A.length + 1; //5
        long start = 1;          //1
        long height = A.length + 1;//5

        long sum = ((start + end) * height )/2;

        long missing_number = sum; // initial setting (sum)

            //subtract all elements one by one.
        for(int i=0; i<A.length; i++){
            missing_number = missing_number - A[i]; // minus other elements
        }

        return (int) missing_number;
    }
}

/**
 * An array A consisting of N different integers is given. The array contains integers in the range [1..(N + 1)], which means that exactly one element is missing.
 *
 * Your goal is to find that missing element.
 *
 * Write a function:
 *
 * class Solution { public int solution(int[] A); }
 *
 * that, given an array A, returns the value of the missing element.
 *
 * For example, given array A such that:
 *
 *   A[0] = 2
 *   A[1] = 3
 *   A[2] = 1
 *   A[3] = 5
 * the function should return 4, as it is the missing element.
 *
 * Write an efficient algorithm for the following assumptions:
 *
 * N is an integer within the range [0..100,000];
 * the elements of A are all distinct;
 * each element of array A is an integer within the range [1..(N + 1)].
 */