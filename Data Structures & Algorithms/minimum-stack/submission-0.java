class MinStack {

    Stack<int[]> stack;

    public MinStack() {
        stack = new Stack<>();
    }
    
    public void push(int val) {
        int[] arr = new int[2];

        if (stack.isEmpty()) {
            arr[0] = val;
            arr[1] = val;
        } else {
            if(stack.peek()[1] <= val){
                arr[0] = val;
                arr[1] = stack.peek()[1];
            } else {
                arr[0] = val;
                arr[1] = val;
            }

        }
        stack.push(arr);
    }
    
    public void pop() {
        if (!stack.isEmpty()) {
            stack.pop();
        }
    }
    
    public int top() {
        return stack.peek()[0];
    }
    
    public int getMin() {
        
        return stack.peek()[1];
    }
}
