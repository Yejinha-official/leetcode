package day6;


// Given two strings s and t, return true if t is an anagram of s, and false otherwise.

// An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

// Example 1:

// Input: s = "anagram", t = "nagaram"
// Output: true
// Example 2:

// Input: s = "rat", t = "car"
// Output: false

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
            // if lengths are different, immediately return false
            if(s.length() != t.length()) return false; 

            // loop s to erase t's character
            int index =0; 
            for(char c : s.toCharArray()){
                index = t.indexOf(c);
                if(index == -1) return false; // if t doesn't have s's character, return false
                t = t.substring(0,index)+t.substring(index+1); // Erase checked character from t 
            }
    
            return true; 
    }
}
