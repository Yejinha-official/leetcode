class MyQueue {

    //  Queue's sequence is reversed stack's
    //  Queue의 순서는 리버스된 순서의 스택과 같다는 점을 이용한다. 
    //  원래 스택 방향 저장할 스택 하나,  리버스된 버전 저장할 스택 하나 만든다. 
    Stack<Integer> rightSeq ; // stack for saving original stack value
    Stack<Integer> reverseSeq;  // stack for saving reversed stack value
    int first ; // saving temporary first value. 

    public MyQueue() {
        rightSeq = new Stack<Integer>(); 
        reverseSeq = new Stack<Integer>(); 
    }
    
    public void push(int x) {
        rightSeq.push(x); 
    }

    // methods for reversing in, out stack. 
    // out스택을 리버스해 in 스택에 저장하도록 한다. 
    public void pushStack(Stack<Integer> in, Stack<Integer> out){
        while(!out.isEmpty()){
            in.push(out.pop());
        }
    }
    
    // 스택을 리버스해  reversedSeq 에 저장하고 First In value 를 찾아서 first 에 저장한다. 
    // 그다음엔 다시 원상복귀 시킨다. ( 다음에 들어올 값들과 순서가 꼬이지 않기 위함)
    // 이 과정이 끝나면 reversedSeq 는 다시 empty 상태가 된다. 

    // reverse stack for confirming first value 
    // After saving first value, re-reverse it to keep original sequence. 
    // By doing that,  reversedSeq stack will be empty. 
    public int pop() {
        pushStack(this.reverseSeq, this.rightSeq);
        first = this.reverseSeq.pop();
        pushStack(this.rightSeq, this.reverseSeq);
        return first;
    }
    

    public int peek() {
        pushStack(this.reverseSeq, this.rightSeq);
        first = this.reverseSeq.peek();
        pushStack(this.rightSeq, this.reverseSeq);
        return first;
    }
    

    public boolean empty() {
        return rightSeq.isEmpty();
    }
}
