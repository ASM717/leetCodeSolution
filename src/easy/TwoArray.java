package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class TwoArray {

    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,4,4,5};
        int[] arr2 = {2,2,3,3};

        HashSet<Integer> set = new HashSet<>();

        for (int num : arr1) {
            set.add(num);
        }

        for (int num : arr2) {
            set.add(num);
        }

        int[] result = new int[set.size()];
        int index = 0;
        for (int num : set) {
            result[index++] = num;
        }

        Arrays.sort(result);

        System.out.println(Arrays.toString(result));

    }

}
