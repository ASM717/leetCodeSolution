package easy;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch =   s.charAt(i);
            if (i > 0 && map.get(ch) > map.get(s.charAt(i - 1))) {
                res += map.get(ch) - 2 * map.get(s.charAt(i -1));
            }
            else res += map.get(ch);
        }
        return res;
    }

    public static void main(String[] args) {
        String roman = "MCMXCIV";
        System.out.println(romanToInt(roman)); //1994
    }
}
