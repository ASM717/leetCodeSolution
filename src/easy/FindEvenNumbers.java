package easy;

public class FindEvenNumbers {
    public static int findNumbers(int[] nums) {

        int count = 0;


        for (int i : nums) {
            String s = String.valueOf(i);
            int len = s.length();

            if (len % 2 == 0)
                count++;

        }
        return count;
    }

    public static void main(String[] args) {
        int nums[] = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }
}
