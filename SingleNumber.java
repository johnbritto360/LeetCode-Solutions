/* 
136. Single Number
Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.

 

Example 1:

Input: nums = [2,2,1]
Output: 1

Example 2:

Input: nums = [4,1,2,1,2]
Output: 4

Example 3:

Input: nums = [1]
Output: 1
 

Constraints:

🎱1 <= nums.length <= 3 * 10^4
🎱-3 * 104 <= nums[i] <= 3 * 10^4
🎱Each element in the array appears twice except for one element which appears only once.
*/

//code in Java:
class SingleNumber {
    public int singleNumber(int[] nums) {
        int alone = 0;
        for (int number : nums) {
            alone ^= number;
        }
        return alone;
    }
    public static void main(String[] args) {
        SingleNumber sn = new SingleNumber();
        int[] arr1 = {2,2,1};
        int[] arr2 = {4,1,2,1,2};
        int[] arr3 = {1};

        System.out.println(sn.singleNumber(arr1));
        System.out.println(sn.singleNumber(arr2));
        System.out.println(sn.singleNumber(arr3));
    }
}
