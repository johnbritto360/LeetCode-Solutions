/* 
217. Contains Duplicate
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

Example 1:

Input: nums = [1,2,3,1]
Output: true

Example 2:

Input: nums = [1,2,3,4]
Output: false

Example 3:

Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true
 

Constraints:

🎱1 <= nums.length <= 10^5
🎱-10^9 <= nums[i] <= 10^9 
*/

//Code in Java:
import java.util.HashSet;
class ContainsDuplicate{
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int number:nums){
            if(!set.add(number)){return true;}
        }
        return false;
    }
    public static void main(String[] xnxx) {
        ContainsDuplicate cd=new ContainsDuplicate();
        int[] arr1={1,2,3,1};
        int[] arr2={1,2,3,4};
        int[] arr3={1,1,1,3,3,4,3,2,4,2};
        System.out.println(cd.containsDuplicate(arr1));
        System.out.println(cd.containsDuplicate(arr2));
        System.out.println(cd.containsDuplicate(arr3));

    }
}