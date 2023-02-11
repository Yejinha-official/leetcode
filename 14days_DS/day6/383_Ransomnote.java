package day6;
// Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.

// Each letter in magazine can only be used once in ransomNote.

// Example 1:

// Input: ransomNote = "a", magazine = "b"
// Output: false
public class Ransomnote {
    public boolean canConstruct(String ransomNote, String magazine) {
        // loop ransomenote to erase magazine's value
        // if ransomenote has any character that magazine doesn't have return false
        // and it only uses same character once by erasing used character in magazine
        int index = 0; 

        for(char d: ransomNote.toCharArray()){
            index = magazine.indexOf(d);
            if(index == -1)  return false; 

            magazine = magazine.substring(0,index)+magazine.substring(index+1);
        }

        return true; 
    }

}