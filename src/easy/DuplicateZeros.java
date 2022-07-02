package easy;

import java.util.Arrays;

public class DuplicateZeros {

    public static void duplicateZeros(int[] arr) {
        int count = 0, n = arr.length;
        for(int i : arr)
            if(i == 0)
                ++count;
        for(int i = n - 1, j = n - 1 + count; i >= 0; --i, --j){
            if(arr[i] == 0) {
                if(j < n)
                    arr[j] = 0;
                --j;
            }
            if(j < n)
                arr[j] = arr[i];
        }
    }

    public static void main(String[] args) {
        int num[] = {1,0,2,3,0,4,5,0};
        duplicateZeros(num);
        System.out.println(Arrays.toString(num));
    }
}
