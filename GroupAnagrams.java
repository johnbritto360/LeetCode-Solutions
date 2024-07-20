/*
49. Group Anagrams
Given an array of strings strs, group the anagrams together. You can return the answer in any order.
An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

Example 1:

Input: strs = ["eat","tea","tan","ate","nat","bat"]
Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

Example 2:

Input: strs = [""]
Output: [[""]]

Example 3:

Input: strs = ["a"]
Output: [["a"]]

Constraints:

🎱1 <= strs.length <= 10^4
🎱0 <= strs[i].length <= 100
🎱strs[i] consists of lowercase English letters.
*/

//Code in Java:
import java.util.*;
class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length==0){return new ArrayList();}
        Map<String, List> res=new HashMap<String, List>();
        for(String str:strs){
            char[] ch=str.toCharArray();
            Arrays.sort(ch);
            String key=String.valueOf(ch);
            if(!res.containsKey(key)){res.put(key,new ArrayList());}
            res.get(key).add(str);
        }
        return new ArrayList(res.values());
    }
    public static void main(String[] xnxx) {
        GroupAnagrams ga=new GroupAnagrams();
        String[] strs1={"eat","tea","tan","ate","nat","bat"};
        String[] strs2={""};
        String[] strs3={"a"};
        List<List<String>> ga1=ga.groupAnagrams(strs1);
        List<List<String>> ga2=ga.groupAnagrams(strs2);
        List<List<String>> ga3=ga.groupAnagrams(strs3);
        System.out.println(ga1);
        System.out.println(ga2);
        System.out.println(ga3);
    }
}
