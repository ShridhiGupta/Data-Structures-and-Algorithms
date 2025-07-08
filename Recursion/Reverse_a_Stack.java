import java.util.Stack;

public class Reverse_a_Stack {
    public static void main(String[] args) {
        Stack <Integer> s = new Stack<>();
        s.push(5);
        s.push(4);
        s.push(3);
        s.push(2);
        s.push(1);
        reverse(s);
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
    static void reverse(Stack <Integer> s) {
        if (s.isEmpty()) return;
        int val = s.pop();
        reverse(s);
        insert(s, val);
    }
    static void insert(Stack <Integer> s, int val) {
        if (s.isEmpty()) {
            s.push(val);
            return;
        }
        int temp = s.pop();
        insert(s, val);
        s.push(temp);
    }
}
