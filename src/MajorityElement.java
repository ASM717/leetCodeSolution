
/*
Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times.
You may assume that the majority element always exists in the array.

Example 1:
Input: nums = [3,2,3]
Output: 3

Example 2:
Input: nums = [2,2,1,1,1,2,2]
Output: 2
 */

import java.util.Arrays;

public class MajorityElement {

    static public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return (nums[nums.length / 2]);
    }

    public static void main(String[] args) {
        int[]nums = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }
}
