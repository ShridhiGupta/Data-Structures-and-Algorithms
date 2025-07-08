import java.util.Stack;

public class Sort_An_Stack {
    public static void main(String[] args) {
        Stack <Integer> stack = new Stack<>();
        stack.push(2);
        stack.push(0);
        stack.push(1); 
        stack.push(5);
        sort(stack);
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
    public static void sort(Stack <Integer> stack) {
        if (stack.isEmpty()) return;
        int temp = stack.pop();
        sort(stack);
        insert(stack, temp);
    }
    public static void insert(Stack <Integer> stack, int temp) {
        if (stack.isEmpty() || stack.peek() <= temp) {
            stack.push(temp);
            return;
        }
        int val = stack.pop();
        insert(stack, temp);
        stack.push(val);
    }
}
