import java.lang.reflect.Array;
import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name = "Shridhi Gupta";
        // System.out.println(Arrays.toString(name.toCharArray()));   
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.charAt(0));
        System.out.println(name.indexOf("Gupta"));
        System.out.println(name.lastIndexOf("i"));
        System.out.println("   Shridhi Gupta   ".strip());
        System.out.println(Arrays.toString(name.split("")));
    }
}
