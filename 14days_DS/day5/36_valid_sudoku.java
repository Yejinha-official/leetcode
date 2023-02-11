//Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:
//
//        Each row must contain the digits 1-9 without repetition.
//        Each column must contain the digits 1-9 without repetition.
//        Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.
//        Note:
//
//        A Sudoku board (partially filled) could be valid but is not necessarily solvable.
//        Only the filled cells need to be validated according to the mentioned rules.

class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character> valid = new HashSet<Character>();
        //step 1: validation for row
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                if(valid.contains(board[i][j])){
                    return false;
                }else{
                    if(board[i][j]!=('.')){
                        valid.add(board[i][j]);
                    }
                }
            }
            valid.clear();
        }
        //step 2: validation for col
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                if(valid.contains(board[j][i])){
                    return false;
                }else{
                    if(board[j][i]!=('.')){
                        valid.add(board[j][i]);
                    }
                }
            }
            valid.clear();
        }

        //step 3: validation for 3*3 square
        int k =0;
        int m = 0;
        while(k <9){
            for(int i=k; i<k+3; i++){
                for(int j=m; j<m+3; j++){
                    if(valid.contains(board[i][j])){
                        return false;
                    }else{
                        if(board[i][j]!=('.')){
                            valid.add(board[i][j]);
                        }
                    }
                }
            }
            valid.clear();
            if(m==6 && k <= 6) {
                m =0;
                k+=3;
            }else if(m < 6){
                m+=3;
            }

        }

        return true;

    }
}