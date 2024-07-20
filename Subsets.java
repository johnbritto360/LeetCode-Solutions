/*
78. Subsets
Given an integer array nums of unique elements, return all possible 
subsets(the power set).

The solution set must not contain duplicate subsets. Return the solution in any order.

Example 1:

Input: nums = [1,2,3]
Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]

Example 2:

Input: nums = [0]
Output: [[],[0]]

Constraints:

🎱1 <= nums.length <= 10
🎱-10 <= nums[i] <= 10
🎱All the numbers of nums are unique.
*/

//Code in Java:
import java.util.ArrayList;
import java.util.List;
class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        int n=nums.length;
        List<List<Integer>>res=new ArrayList<>();
        for(int i=0;i<Math.pow(2,n);i++){
            List<Integer> list=new ArrayList<>();
            for(int j=0;j<n;j++){
                if(((1<<j)&i)!=0){
                    list.add(nums[j]);
                }
            }
            res.add(list);
        }
        return res;
    }    
    public static void main(String[] xnxx) {
        Subsets s=new Subsets();
        int[] arr1={1,2,3};
        int[] arr2={0};
        System.out.println(s.subsets(arr1));
        System.out.println(s.subsets(arr2));
    }
}
