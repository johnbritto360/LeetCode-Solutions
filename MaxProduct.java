/*
628. Maximum Product of Three Numbers
Given an integer array nums, find three numbers whose product is maximum and return the maximum product.

Example 1:

Input: nums = [1,2,3]
Output: 6

Example 2:

Input: nums = [1,2,3,4]
Output: 24

Example 3:

Input: nums = [-1,-2,-3]
Output: -6

Constraints:

🎱3 <= nums.length <= 10^4
🎱-1000 <= nums[i] <= 1000
*/

//Code in Java
import java.util.Arrays;
class MaxProduct {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        return Math.max(nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3],
                        nums[0]*nums[1]*nums[nums.length-1]);
    }
    public static void main(String[] xnxx) {
        MaxProduct mp = new MaxProduct();
        int[] arr1={1,2,3};
        int[] arr2={1,2,3,4};
        int[] arr3={-1,-2,-3};
        System.out.println(mp.maximumProduct(arr1));
        System.out.println(mp.maximumProduct(arr2));
        System.out.println(mp.maximumProduct(arr3));
    } 
}
