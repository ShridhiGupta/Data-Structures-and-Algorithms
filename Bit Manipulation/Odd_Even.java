public class Odd_Even{
    public static void main(String[] args) {
        int n = 62;
        System.out.println(isOdd(n));
    }
    private static boolean isOdd(int n){
        return (n&1) == 1;
    }
}