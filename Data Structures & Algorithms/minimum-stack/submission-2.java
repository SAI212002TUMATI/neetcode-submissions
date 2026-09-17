class MinStack {

    private Deque<Integer>stack ;
    private Deque<Integer>minStack;

    public MinStack() {
        stack=new ArrayDeque<>();
        minStack=new ArrayDeque<>();
        
    }
    
    public void push(int val) {
        stack.push(val);
        
        if(minStack.isEmpty()){
            minStack.push(val);
        }else{
            int currentMin=minStack.peek();
            minStack.push(Math.min(currentMin,val));
        }
        
    }
    
    public void pop() {
        stack.pop();
        minStack.pop();
        
    }
    
    public int top() {

        return stack.peek();
        
    }
    
    public int getMin() {

        return minStack.peek();
        
    }
}
