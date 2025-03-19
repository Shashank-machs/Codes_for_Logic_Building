/*
Given two strings s and t, return true if t is an anagram of s, and false otherwise.



Example 1:

Input: s = "anagram", t = "nagaram"

Output: true

Example 2:

Input: s = "rat", t = "car"

Output: false



Constraints:

1 <= s.length, t.length <= 5 * 104
s and t consist of lowercase English letters.
 */
public class valid_anagram {

    public static boolean isAnagram(String s, String t) {
        //Method 1
      /*  int[] arr1 = new int[26];
        int[] arr2 = new int[26];
        if(s.length()!=t.length()){
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            arr1[s.charAt(i)-'a']++;
            arr2[t.charAt(i)-'a']++;

        }
        for (int i = 0; i < s.length(); i++) {
            if(arr1[i]!=arr2[i]){
                return false;
            }
        }
        return true;

       */

        //Method 2
        int[] arr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            arr[t.charAt(i) - 'a']--;
        }
        for (int val : arr) {
            if (val != 0) {
                return false;
            }
        }
        return true;
    }



    public static void main(String[] args) {
        System.out.println(isAnagram("anagram","nagaram"));
    }

}
