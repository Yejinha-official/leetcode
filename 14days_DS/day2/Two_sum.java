//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//
//        You may assume that each input would have exactly one solution, and you may not use the same element twice.
//
//        You can return the answer in any order.
//
//
//
//        Example 1:
//
//        Input: nums = [2,7,11,15], target = 9
//        Output: [0,1]
//        Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
//        Example 2:
//
//        Input: nums = [3,2,4], target = 6
//        Output: [1,2]
//        Example 3:
//
//        Input: nums = [3,3], target = 6
//        Output: [0,1]

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // step 0 : All we have to do is find out which indexes make nums[i]+ nums[j] = target

        // step 1 : make a Hashmap that saves target-nums[i](nums[j]) to find out matching number
        //  key : target-nums[i], value : original index
        HashMap<Integer, Integer> subNum = new HashMap<Integer, Integer>();

        for(int i=0; i<nums.length; i++){
            subNum.put((target-nums[i]),i);
        }

        // step 2 : if nums[j] is in Hashmap, that means there is a value of target-nums[j] in nums array
        // return j and matching index.
        for(int j=0; j<nums.length; j++){
            if(subNum.get(nums[j])!=null && j!=subNum.get(nums[j])){
                return new int[]{j, subNum.get(nums[j])};
            }
        }


        return null;
    }
}