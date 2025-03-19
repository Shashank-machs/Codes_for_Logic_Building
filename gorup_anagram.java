

/*
Given an array of strings strs, group the anagrams together. You can return the answer in any order.



Example 1:

Input: strs = ["eat","tea","tan","ate","nat","bat"]

Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

Explanation:

There is no string in strs that can be rearranged to form "bat".
The strings "nat" and "tan" are anagrams as they can be rearranged to form each other.
The strings "ate", "eat", and "tea" are anagrams as they can be rearranged to form each other.
Example 2:

Input: strs = [""]

Output: [[""]]

Example 3:

Input: strs = ["a"]

Output: [["a"]]



Constraints:

1 <= strs.length <= 104
0 <= strs[i].length <= 100
strs[i] consists of lowercase English letters.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
public class gorup_anagram {
    public static List<List<String>> groupAnagrams(String[] strs){
        HashMap<String,List<String>>map =new HashMap<>();
        for(String words:strs){
            char[] chars=words.toCharArray();
            Arrays.sort(chars);
            String sortWord=new String(chars);
            if(!map.containsKey(sortWord)){
                map.put(sortWord,new ArrayList<>());
            }
            map.get(sortWord).add(words);
        }
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String[] words={"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(words));
    }
}
