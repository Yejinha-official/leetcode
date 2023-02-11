//Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.

//        Example 1:
//
//        Input: nums1 = [1,2,2,1], nums2 = [2,2]
//        Output: [2,2]
//        Example 2:
//
//        Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
//        Output: [4,9]
//        Explanation: [9,4] is also accepted.

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        // step 1: put nums1 in HashMap to save values and frequencies
        HashMap<Integer, Integer> hashNums1 = new HashMap<Integer, Integer>();

        for(int i: nums1){
            hashNums1.put(i, hashNums1.getOrDefault(i, 0)+1); // if i is already in hashmap, increase frequencies, default is 1
        }

        // step2 : set arraylist to save results.
        ArrayList<Integer> arrList = new ArrayList<Integer>();

        for(int j: nums2){
            if(hashNums1.containsKey(j)&& hashNums1.get(j)>0){
                arrList.add(j);
                hashNums1.replace(j, hashNums1.get(j)-1);
            }
        }

        int[] result = arrList.stream().mapToInt(i -> i).toArray();

        return result;
    }
}