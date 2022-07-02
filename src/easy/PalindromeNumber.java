package easy;

//Given an integer x, return true if x is palindrome integer.
//  An integer is a palindrome when it reads the same backward as forward.
//  For example, 121 is a palindrome while 123 is not.

public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        int r, sum = 0, temp;

        temp = x;
        while (x > 0) {
            r = x % 10;
            sum = (sum * 10) + r;
            x = x/10;
        }
        return temp == sum;
    }

    public static void main(String[] args) {
        int x = 454;
        System.out.println(isPalindrome(x));
    }
}
