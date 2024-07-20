/*
283. Move Zeros
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.

Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]

Example 2:

Input: nums = [0]
Output: [0]

Constraints:

🎱1 <= nums.length <= 10^4
🎱-231 <= nums[i] <= 231 - 1
*/

//Code in Java:
class MoveZeros{
    public void moveZeroes(int[] nums) {
        int index=0;
        for(int value:nums){
            if(value!=0){nums[index++]=value;}
        }
        while(index<nums.length){nums[index++]=0;}
    }
    public static void main(String[] xnxx) {
        MoveZeros mz=new MoveZeros();
        int[] arr1={0,1,0,3,12};
        mz.moveZeroes(arr1);
        for(int value:arr1){System.out.print(value+" ");}
        System.out.println();
        int[] arr2={0};
        mz.moveZeroes(arr2);
        for(int value:arr2){System.out.print(value+" ");}
    }
}