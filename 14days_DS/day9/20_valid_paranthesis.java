class Solution {
    public boolean isValid(String s) {
        // step 0 : make string to char array to use stack 
        Stack<Character> opening = new Stack<>();
        char[] array = s.toCharArray();
        // if array.length <=1 , it is obviously invalid. 
        // the minimun length = 2 
        if(array.length <=1) return false; 

        for(int i=0; i<array.length; i++){
            // step 1: if it is  opening characters like ({[ push to stack 
            if(array[i]=='(' || array[i] == '[' ||  array[i] =='{'){
                opening.push(array[i]);
            }else{
                // if closing bracket comes first, returns false 
                if(opening.isEmpty()) return false; 
                // step 2 : else  compare stack's peek value (cause it has to be a corresponding open bracket)
                switch(array[i]) {
                    case ')' : if(opening.peek() == '(' ){
                                 opening.pop() ;
                                }else return false; 
                                break; 
                    case ']' : if(opening.peek() == '[' ){
                                 opening.pop() ;
                                }else return false; 
                                break; 
                    case '}' : if(opening.peek() == '{' ){
                                 opening.pop() ;
                                }else return false; 
                                break; 
                }
            }
        }

        return opening.isEmpty(); 

    }
}
