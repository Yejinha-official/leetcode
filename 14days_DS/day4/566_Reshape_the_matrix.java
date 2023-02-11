//In MATLAB, there is a handy function called reshape which can reshape an m x n matrix into a new one with a different size r x c keeping its original data.
//        You are given an m x n matrix mat and two integers r and c representing the number of rows and the number of columns of the wanted reshaped matrix.
//
//        The reshaped matrix should be filled with all the elements of the original matrix in the same row-traversing order as they were.
//
//        If the reshape operation with given parameters is possible and legal, output the new reshaped matrix; Otherwise, output the original matrix.

class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m =  mat.length;
        int n =  mat[0].length;
        if(r*c != m*n) return mat;  // if reshaping is not available, return input itself.

        int[][] newMat = new int[r][c];
        int newRow = 0;
        int newCol = 0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(newCol < c){  // fill in accordingly.
                    newMat[newRow][newCol]= mat[i][j];
                    newCol++;
                }
                if(newCol == c && newRow < r){
                    newRow++;
                    newCol =0;
                }
            }
        }

        return newMat;
    }
}