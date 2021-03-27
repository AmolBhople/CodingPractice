package ab.techstack.coding.problems.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
 *
 * Symbol       Value
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * For example, 2 is written as II in Roman numeral, just two one's added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.
 *
 * Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
 *
 * I can be placed before V (5) and X (10) to make 4 and 9.
 * X can be placed before L (50) and C (100) to make 40 and 90.
 * C can be placed before D (500) and M (1000) to make 400 and 900.
 *
 *  *
 *  * //        CD=400
 *  * //        CM=900
 *  * //        XL=40
 *  * //        XC=90
 *  * //        IV=4
 *  * //        IX=9
 *
 *  Input: num = 58
 * Output: "LVIII"
 * Explanation: L = 50, V = 5, III = 3.

 *
 * Input: num = 1994
 * Output: "MCMXCIV"
 * Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
 *
 * 549   DXLIX    /500   1   49
 * 449  CDXLIX
 * 999   CMXCIX   /500   1   499
 *
 */
public class IntToRoman {
    TreeMap<Integer, String> treemap = new TreeMap<Integer, String>();

    public IntToRoman(){
        treemap.put(1000, "M");
        treemap.put(900, "CM");
        treemap.put(500, "D");
        treemap.put(400, "CD");
        treemap.put(100, "C");
        treemap.put(90, "XC");
        treemap.put(50, "L");
        treemap.put(40, "XL");
        treemap.put(10, "X");
        treemap.put(9, "IX");
        treemap.put(5, "V");
        treemap.put(4, "IV");
        treemap.put(1, "I");
    }

    public String intToRoman(int num) {
        Integer flrKey = treemap.floorKey(num);
        if(flrKey == num){
            return treemap.get(flrKey);
        }else{
            return treemap.get(flrKey) + intToRoman(num-flrKey);
        }
    }

}
