import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b');
        System.out.println("a" + "b"); // opeartor overloading
        System.out.println("a" + 'b'); // opeartor overloading
        System.out.println('a' + 1);
        System.out.println((char)('a' + 1));
        System.out.println("a" + 1);
        // this is same as after a few steps : "a" + "1" => "a1"
        // ineteger will be converted to Integer that will call toString() method
        System.out.println("Kunal" + new ArrayList<>());
        System.out.println("kunal" + new Integer(56));
        System.out.println(new Integer(56) +""+ new ArrayList<>());
        System.out.println(1 + 2 + "a" + 3 + 4);
    }
}
