package easy;

public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
//        int i = 0, j = 0, k = 0;
//        //
//        while (i < n && j < m) {
//            if (nums1[i] < nums2[j])
//                num3[k++] = nums1[i++];
//            else num3[k++] = nums2[j++];
//        }
//        while (i < m)
//            num3[k++] = nums1[i++];
//        while (j < m)
//            num3[k++] = nums2[j++];
//        System.out.println(Arrays.toString(num3));
    }

    public static void main(String[] args) {
        int [] num1 = {1,2,3,0,0,0};
        int [] num2 = {2,5,6};
        merge(num1, 3, num2, 3);
    }
}
