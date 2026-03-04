public class AndOrXor{
    public static void main(String[] args) {
        System.out.println(51&42);
        System.out.println(51|42);
        System.out.println(1^1^0);

        int x = 5;
        System.out.println(~x); // 1's Complement
        System.out.println(-x-1); // 1's Complement
        System.out.println(~x+1); // 2's Complement
        System.out.println(-x); // 2's Complement
    }
}