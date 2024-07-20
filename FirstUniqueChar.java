/*
387. First Unique Character in a String
Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.

Example 1:

Input: s = "leetcode"
Output: 0
Example 2:

Input: s = "loveleetcode"
Output: 2
Example 3:

Input: s = "aabb"
Output: -1

Constraints:

🎱1 <= s.length <= 10^5
🎱s consists of only lowercase English letters.
*/

//Code in Java
import java.util.HashMap;
import java.util.Map;
class FirstUniqueChar {
    public int firstUniqChar(String s) {
        if(s==null||s.length()==0){return -1;}
        Map<Character, Integer> hh=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            hh.put(c,hh.getOrDefault(c,0)+1);
        }
        for(int i=0;i<s.length();i++){
            if(hh.get(s.charAt(i))==1){return i;}
        }
        return -1;
    }
    public static void main(String[] xnxx) {
        FirstUniqueChar f=new FirstUniqueChar();
        System.out.println(f.firstUniqChar("leetcode"));
        System.out.println(f.firstUniqChar("loveleetcode"));
        System.out.println(f.firstUniqChar("aabb"));
    }
}
