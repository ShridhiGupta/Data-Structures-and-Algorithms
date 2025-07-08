// this is a demo to show intialization of static variables
public class Static_Block {
    static int a = 4;
    static int b;

    // will only run once, when the first object is created i.e. when the class is loaded for the first time
    static{
        System.out.println("I am in static block");
        b = a * 5;
    }

    public static void main(String[] args) {
        Static_Block obj = new Static_Block();
        System.out.println(Static_Block.a + " " + Static_Block.b);
        Static_Block.b += 3;
        System.out.println(Static_Block.a + " " + Static_Block.b);
        Static_Block obj2 = new Static_Block();
        System.out.println(Static_Block.a + " " + Static_Block.b);

    }
}
