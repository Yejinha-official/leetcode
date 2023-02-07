import java.util.HashSet;

//Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

//        Example 1:
//
//        Input: nums = [1,2,3,1]
//        Output: true
//        Example 2:
//
//        Input: nums = [1,2,3,4]
//        Output: false
//        Example 3:
//
//        Input: nums = [1,1,1,3,3,4,3,2,4,2]
//        Output: true

public class Contains_duplicate {
    public boolean containsDuplicate(int[] nums) {
        // 중복 있으면 true 없으면 false
        // If it contains duplicate value, return true.

        // sol1 : brute force ->  loop twice to find out duplicate number
        // for(int i=0; i<nums.length-1; i++){
        //     for(int j=i+1; j<nums.length; j++){
        //         if(nums[i]==nums[j]) return true;
        //     }
        // }

        //sol2 : use another arraylist to check if it is duplicated
        //using hashset !!!!!!!!
        HashSet<Integer> check = new HashSet<Integer>();

        for(int i=0; i<nums.length; i++){
            if(check.contains(nums[i])){
                return true;
            }else{
                check.add(nums[i]);
            }
        }


        return false;
    }
}
