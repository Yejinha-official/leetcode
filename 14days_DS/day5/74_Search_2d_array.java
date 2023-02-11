//You are given an m x n integer matrix matrix with the following two properties:
//
//        Each row is sorted in non-decreasing order.
//        The first integer of each row is greater than the last integer of the previous row.
//        Given an integer target, return true if target is in matrix or false otherwise.
//
//        You must write a solution in O(log(m * n)) time complexity.


class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //1차원 배열로 바꿔서 binary search 로 다시 풀어보기 *****

        int m = matrix.length;
        int n = matrix[0].length;

        //step 0 :  if target is smaller than the first number or larger than the last number, return false;
        if(target < matrix[0][0] || target > matrix[m-1][n-1]){
            return false;
        }

        // step 1:  find out that target could be in which row
        // (by comparing with the first integer of row bc that is the smallest integer of that row)
        // and loop possible row
        for(int i=0; i<m; i++){
            if(matrix[i][0] <= target || (matrix[i][n-1] >= target)) {
                for(int j=0; j<n; j++){
                    if(matrix[i][j]==target) return true;
                }
            }
        }

        return false;

    }
}