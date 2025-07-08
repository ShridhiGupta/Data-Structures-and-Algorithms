public class Custom_Stack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int ptr = -1;

    public Custom_Stack() {
        this(DEFAULT_SIZE);
    }

    public Custom_Stack(int size) {
        this.data = new int[size];
    }

    public boolean push(int item){
        if(isFull()){
            System.out.println("Stack is full");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }
    public int pop() throws Exception{
        if(isEmpty()){
            throw new Exception("Cannot pop from an empty stack!");
        }
        // int removed = data[ptr];
        // ptr--;
        // return removed;
        return data[ptr--];
    }
    public int peek() throws Exception{
        if(isEmpty()){
            throw new Exception("Cannot peek from an empty stack!");
        }
        return data[ptr];
    }
    public boolean isFull(){
        return ptr == data.length - 1;
    }
    public boolean isEmpty(){
        return ptr == -1;
    }
    public static void main(String[] args) throws Exception {
        Custom_Stack stack = new Dynamic_Stack(5);
            stack.push(34);
            stack.push(45);
            stack.push(2);
            stack.push(9);
            stack.push(18);
            stack.push(23);
            System.out.println(stack.pop());
            System.out.println(stack.pop());    
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
    }
}
