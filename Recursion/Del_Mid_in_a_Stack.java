import java.util.Stack;

public class Del_Mid_in_a_Stack {
    public static void main(String[] args) {
        Stack <Integer> s = new Stack<>();
        s.push(5);
        s.push(4);
        s.push(3);
        s.push(2);
        s.push(1);
        int k = s.size() / 2 + 1;
        s = deleteMid(s, k);
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
    static Stack <Integer> deleteMid(Stack <Integer> s, int k) {
        if (s.isEmpty()) return s;
        solve(s, k);
        return s;
    }
    static void solve(Stack <Integer> s, int k) {
        if (k == 1) {
            s.pop();
            return;
        }
        int temp = s.pop();
        solve(s, k - 1);
        s.push(temp);
    }
}
