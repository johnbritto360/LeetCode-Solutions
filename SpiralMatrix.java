/* 
54. Spiral Matrix
Given an m x n matrix, return all elements of the matrix in spiral order.

Example 1:

Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [1,2,3,6,9,8,7,4,5]

Example 2:

Input: matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
Output: [1,2,3,4,8,12,11,10,9,5,6,7]

Constraints:

🎱m == matrix.length
🎱n == matrix[i].length
🎱1 <= m, n <= 10
🎱-100 <= matrix[i][j] <= 100
*/

//Code in Java:
import java.util.*;
class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list=new ArrayList<>();
        if(matrix.length==0){return list;}
        int rb=0,cb=0,re=matrix.length-1,ce=matrix[0].length-1;
        while(rb<=re&&cb<=ce){
            for(int i=cb;i<=ce;i++){list.add(matrix[rb][i]);}
            rb++;
            for(int i=rb;i<=re;i++){list.add(matrix[i][ce]);}
            ce--;
            if(rb<=re){
                for(int i=ce;i>=cb;i--){list.add(matrix[re][i]);}
            }
            re--;
            if(cb<=ce){
                for(int i=re;i>=rb;i--){list.add(matrix[i][cb]);}
            }
            cb++;
        }
        return list;
    }
    public static void main(String[] xnxx) {
        SpiralMatrix sm = new SpiralMatrix();
        int[][] arr1={{1,2,3},
                      {4,5,6},
                      {7,8,9}};
        int[][] arr2={{1,2,3,4},
                      {5,6,7,8},
                      {9,10,11,12}};
        System.out.println(sm.spiralOrder(arr1));
        System.out.println(sm.spiralOrder(arr2));
    }
}