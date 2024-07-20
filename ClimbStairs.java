/* 
70. Climbing Stairs
You are climbing a staircase. It takes n steps to reach the top.
Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

Example 1:

Input: n = 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps

Example 2:

Input: n = 3
Output: 3
Explanation: There are three ways to climb to the top.
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step

Constraints:

🎱1 <= n <= 45
*/
//Code in Java:
class ClimbStairs{
    public int climbStairs(int n) {
        int[] res=new int[n+1];
        res[0]=1;res[1]=1;
        for(int i=2;i<res.length;i++){res[i]=res[i-1]+res[i-2];}
        return res[n];
    }
    public static void main(String[] xnxx){
        ClimbStairs cs=new ClimbStairs();
        System.out.println(cs.climbStairs(3));
        System.out.println(cs.climbStairs(4));
    }
}