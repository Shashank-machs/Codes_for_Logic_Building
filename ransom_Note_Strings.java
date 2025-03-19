/*
Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.

Each letter in magazine can only be used once in ransomNote.



Example 1:

Input: ransomNote = "a", magazine = "b"
Output: false
Example 2:

Input: ransomNote = "aa", magazine = "ab"
Output: false
Example 3:

Input: ransomNote = "aa", magazine = "aab"
Output: true


Constraints:

1 <= ransomNote.length, magazine.length <= 105
ransomNote and magazine consist of lowercase English letters.
 */

import java.util.HashMap;

public class ransom_Note_Strings {

        public  static boolean canConstruct(String r, String m) {
            HashMap<Character,Integer> map=new HashMap<>();
            for(int i=0;i<m.length();i++){
                map.put(m.charAt(i),map.getOrDefault(m.charAt(i),0)+1);
            }
            for(char c:r.toCharArray()){
                if(!map.containsKey(c) || map.get(c)<=0){
                    return false;
                }
                map.put(c,map.get(c)-1);
            }
            return true;


    }
    public boolean canConstruct_2(String ransomNote, String magazine) {
        // Array to store frequency of characters in magazine
        int[] charCount = new int[26];

        // Count the occurrences of each character in magazine
        for (char c : magazine.toCharArray()) {
            charCount[c - 'a']++;
        }

        // Check if ransomNote can be constructed
        for (char c : ransomNote.toCharArray()) {
            if (charCount[c - 'a'] == 0) {
                return false; // If a required character is missing, return false
            }
            charCount[c - 'a']--; // Use one occurrence of the character
        }

        return true;
    }

    public static void main(String[] args) {
        String ransomNote = "aa";
        String magazine = "aab";
        System.out.println(canConstruct(ransomNote,magazine));

       //mathod calling by creating an object of calass(sample)
        ransom_Note_Strings obj=new ransom_Note_Strings();
        System.out.println(obj.canConstruct_2(ransomNote,magazine));

    }

}
