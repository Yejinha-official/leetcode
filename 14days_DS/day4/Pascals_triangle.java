//Given an integer numRows, return the first numRows of Pascal's triangle.
//Example 1:
//        Input: numRows = 5
//        Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]


class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();

        List<Integer> prev = null; //save Prev array

        for(int i=1; i<numRows+1; i++){
            List<Integer> save = new ArrayList<Integer>();
            for(int j=1; j<=i; j++){
                if(j == 1 || j == i){
                    save.add(1);
                }else{
                    save.add(prev.get(j-2)+prev.get(j-1));  //arraylist 에서는 0 부터 세니까 -2.-1  (arraylist counts index from 0 so we have to match the index
                }
            }
            result.add(save);
            prev = save;

        }


        return result;
    }
}