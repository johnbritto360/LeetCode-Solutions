/*
118. Pascal's Triangle
Given an integer numRows, return the first numRows of Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:

Example 1:

Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]

Example 2:

Input: numRows = 1
Output: [[1]]
 

Constraints:

🎱1 <= numRows <= 30 
*/

//Code in Java:
import java.util.*;
class PascalsTriangle{
    public List<List<Integer>> generate(int numRows) {
        if(numRows==0){return new ArrayList<>();}
        if(numRows==1){
            List<List<Integer>> ans=new ArrayList<>();
            ans.add(Arrays.asList(1));
            return ans;
        }
        List<List<Integer>> rows=generate(numRows-1);
        List<Integer>row=new ArrayList<>();
        for(int i=0;i<numRows;i++){
            row.add(1);
        }
        for(int i=1;i<numRows-1;i++){
            row.set(i,rows.get(numRows-2).get(i-1)+rows.get(numRows-2).get(i));
        }
        rows.add(row);
        return rows;
    }
    public static void main(String[] xnxx) {
        PascalsTriangle pt=new PascalsTriangle();
        System.out.println(pt.generate(5));
        System.out.println(pt.generate(1));

    }
}