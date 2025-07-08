public class Wrapper {
    public static void main(String[] args) {
        Integer a = 10;
        Integer b = 20;
        Integer num = 45;
        swap(a, b);
        System.out.println(a + " " + b);
        final A kunal = new A("Kunal");
        kunal.name = "Kunal Kushwaha";
        // when a non-primitive is final, you can not reassign it
        // kunal = new A("Kunal Kushwaha");
        A obj;
        for(int i = 0; i < 10; i++){
            obj = new A("Object" + i);
        }

    }
    static void swap(Integer a, Integer b){
        Integer temp = a;
        a = b;
        b = temp;
    }
    
}
class A{
    final int num = 10;
    String name;
    public A(String name){
        System.out.println("Object is created");
        this.name = name;
    }
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed");
    }
}