public class Comparison {
    public static void main(String[] args) {
        String a = "Shridhi";
        String b = "Shridhi";
        String c = new String("Shridhi");
        System.out.println(a == b);
        System.out.println(a == c); 
        System.out.println(a.equals(c));
    }
}
