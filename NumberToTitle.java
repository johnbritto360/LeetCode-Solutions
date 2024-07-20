/*
168. Excel Sheet Column Title
Given an integer columnNumber, return its corresponding column title as it appears in an Excel sheet.

For example:

A -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28 
...
 

Example 1:

Input: columnNumber = 1
Output: "A"

Example 2:

Input: columnNumber = 28
Output: "AB"

Example 3:

Input: columnNumber = 701
Output: "ZY"

Constraints:

🎱1 <= columnNumber <= 231 - 1
*/

//Code in Java:
class NumberToTitle{
    public String convertToTitle(int columnNumber) {
        String result="";
        while(columnNumber>0){
            columnNumber--;
            result=(char)(columnNumber%26+'A')+result;
            columnNumber/=26;
        }
        return result.toString();
    }
    public static void main(String[] xnxx) {
        NumberToTitle n=new NumberToTitle();
        System.out.println(n.convertToTitle(1));
        System.out.println(n.convertToTitle(28));
        System.out.println(n.convertToTitle(701));
    }
}