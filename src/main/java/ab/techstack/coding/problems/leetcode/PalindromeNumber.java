package ab.techstack.coding.problems.leetcode;

/**
 * Given an integer x, return true if x is palindrome integer.
 *
 * An integer is a palindrome when it reads the same backward as forward. For example, 121 is palindrome while 123 is not.
 * Constraints:
 *
 * -2^31 <= x <= 2^31 - 1
 *
 *
 * Follow up: Could you solve it without converting the integer to a string?
 */
public class PalindromeNumber {

    public boolean isPalindrome(int x) {
        int num = x;
        int rev=0;
        if(x>=0) {
            while (x != 0) {
                int rem = x % 10;
                x = x / 10;
                if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && rem > 2))
                    return false;
                rev = rev * 10 + rem;
            }
            if (rev == num)
                return true;
        }
        return false;
    }
}
