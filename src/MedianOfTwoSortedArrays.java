
/*
Given two sorted arrays nums1 and nums2 of size m and n respectively,
                          return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n)).

Example 1:

Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.
Example 2:

Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
 */

import java.util.ArrayList;
import java.util.Collections;

public class MedianOfTwoSortedArrays {

    static public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        double sum = 0;

        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < n1; i++) {
            list1.add(nums1[i]);
        }
        for (int i = 0; i < n2; i++) {
            list1.add(nums2[i]);
        }
        Collections.sort(list1);

        if (list1.size() % 2 == 0) {
            sum = (double)((list1.get(list1.size() / 2)) + (list1.get(list1.size() / 2 - 1))) / 2;
        }
        else {
            sum = list1.get(list1.size() / 2);
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};

        System.out.println(findMedianSortedArrays(nums1, nums2));
    }
}
