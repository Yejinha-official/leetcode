//You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
//
//        Merge nums1 and nums2 into a single array sorted in non-decreasing order.
//
//        The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
//
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // compare each array from the last number
        // and put in the nums1's last index
        // 뒤에서부터 비교하면서 nums1의 마지막 인덱스부터 채운다. 정렬되어있는 어레이이기에 가능.

        int k= nums1.length-1; //nums1's physical last index
        int a = m-1; //nums1's last index
        int b = n-1;

        while(b>=0 && k>=0){

            if(a >=0 && nums1[a] > nums2[b]){
                nums1[k]=nums1[a];
                a--;
            }else{
                nums1[k]=nums2[b];
                b--;
            }
            k--;
        }

    }
}