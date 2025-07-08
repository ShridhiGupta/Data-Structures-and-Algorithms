public class Print_1_to_n {
    public static void main(String[] args) {
        int n = 10;
        print(n);
    }
    static void print(int n) {
        if (n == 0) {
            return;
        }
        print(n - 1);
        System.out.println(n);
    }
    static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        return n * fact(n - 1);
    }
}
