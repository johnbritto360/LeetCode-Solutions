/* 
20. Valid Parentheses
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
 

Example 1:

Input: s = "()"
Output: true

Example 2:

Input: s = "()[]{}"
Output: true

Example 3:

Input: s = "(]"
Output: false
 

Constraints:

🎱1 <= s.length <= 10^4
🎱s consists of parentheses only '()[]{}'.
*/

//Code in Java:
import java.util.Stack;
class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='('){st.push(')');}
            else if(c=='{'){st.push('}');}
            else if(c=='['){st.push(']');}
            else if(st.isEmpty()||st.pop()!=c){
                return false;
            }
        }
        return st.isEmpty();
    }
    public static void main(String[] xnxx){
        ValidParentheses v=new ValidParentheses();
        System.out.println(v.isValid("()"));
        System.out.println(v.isValid("()[]{}"));
        System.out.println(v.isValid("(]"));
    }
}
