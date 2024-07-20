/*
135. Candy
There are n children standing in a line. Each child is assigned a rating value given in the integer array ratings.

You are giving candies to these children subjected to the following requirements:

Each child must have at least one candy.
Children with a higher rating get more candies than their neighbors.
Return the minimum number of candies you need to have to distribute the candies to the children.

Example 1:

Input: ratings = [1,0,2]
Output: 5
Explanation: You can allocate to the first, second and third child with 2, 1, 2 candies respectively.

Example 2:

Input: ratings = [1,2,2]
Output: 4
Explanation: You can allocate to the first, second and third child with 1, 2, 1 candies respectively.
The third child gets 1 candy because it satisfies the above two conditions.
 

Constraints:

🎱n == ratings.length
🎱1 <= n <= 2 * 10^4
🎱0 <= ratings[i] <= 2 * 10^4 
*/

//Code in Java:
import java.util.Arrays;
class Candy{
    public int candy(int[] ratings) {
        int size=ratings.length, result=0;
        int[] leftArr=new int[size], rightArr=new int[size];
        Arrays.fill(leftArr,1);
        Arrays.fill(rightArr,1);
        for(int i=1;i<size;i++){
            if(ratings[i]>ratings[i-1]){leftArr[i]=leftArr[i-1]+1;}
        }
        for(int i=size-2;i>=0;i--){
            if(ratings[i]>ratings[i+1]){rightArr[i]=rightArr[i+1]+1;}
        }
        for(int i=0;i<size;i++){
            result+=Math.max(leftArr[i],rightArr[i]);
        }
        return result;
    }
    public static void main(String[] xnxx){
        Candy c = new Candy();
        int[] arr1={3,5,0,2,1};
        int[] arr2={1,2,2};
        System.out.println(c.candy(arr1));
        System.out.println(c.candy(arr2));
    }
}