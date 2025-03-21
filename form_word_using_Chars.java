/*
You are given an array of strings words and a string chars.

A string is good if it can be formed by characters from chars (each character can only be used once).

Return the sum of lengths of all good strings in words.



Example 1:

Input: words = ["cat","bt","hat","tree"], chars = "atach"
Output: 6
Explanation: The strings that can be formed are "cat" and "hat" so the answer is 3 + 3 = 6.
Example 2:

Input: words = ["hello","world","leetcode"], chars = "welldonehoneyr"
Output: 10
Explanation: The strings that can be formed are "hello" and "world" so the answer is 5 + 5 = 10.


Constraints:

1 <= words.length <= 1000
1 <= words[i].length, chars.length <= 100
words[i] and chars consist of lowercase English letters.
 */
public class form_word_using_Chars {
    public static int  cnt_chars(String[] words, String chars){
        int []counts=new int[26];
//        for(char c:chars.toCharArray()){
//            counts[c-'a']++;
//        }
        for(int i=0;i<chars.length();i++)
        {
            counts[chars.charAt(i)-'a']++;
        }
        int x=0;
        for(String s:words){
            if(can_form(s,counts)){
                x+=s.length();
            }
        }
        return x;
    }
    // method to check word inside string can for by using given chars
    public static boolean can_form(String word,int [] counts){
        int[] arr=new int[26];
        for(char c:word.toCharArray()){
            arr[c-'a']++;
            if(arr[c-'a']>counts[c-'a']){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String[] arr={"cat","bt","hat","tree"};
        String  chars = "atach";
        System.out.println(cnt_chars(arr,chars));
    }
}
