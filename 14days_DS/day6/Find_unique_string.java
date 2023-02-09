// Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.

// Example 1:

// Input: s = "leetcode"
// Output: 0
// Example 2:

// Input: s = "loveleetcode"
// Output: 2
// Example 3:

// Input: s = "aabb"
// Output: -1

class Solution {
    public int firstUniqChar(String s) {
      // Loop to make a hashmap to save its value and frequency 
      HashMap<Character, Integer> hashmap = new HashMap<Character, Integer>();
      
      for(int i=0; i<s.length(); i++){
          hashmap.put(s.charAt(i), hashmap.getOrDefault(s.charAt(i),0)+1); 
          
      }

      // loop to find out the index that has frequency of 1 
      for(int j=0; j<s.length(); j++){
          if(hashmap.get(s.charAt(j))==1){
            return j; 
          }
      }

      return -1; 
    }
}