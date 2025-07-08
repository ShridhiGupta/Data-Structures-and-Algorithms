// outside classes can not be static
// beacuse it is itself not dependent on any other class
public class Inner_Classes {
    static  class Test{
        String name;

        public Test(String name) {
            this.name = name;
        }
    }
    public static void main(String[] args) {
        Test a = new Test("Kunal");
    }
}
