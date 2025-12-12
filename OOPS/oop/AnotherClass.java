class yes{
    public void greet(){
        System.out.println("Hello");
    }
}
class AnotherClass {
    class InnerClass {
        public void show() {
            System.out.println("Inner Class Method");
        }
    }
    public static void main(String[] args) {
        AnotherClass outer = new AnotherClass();
        InnerClass inner = outer.new InnerClass();
        inner.show();
        yes a = new yes();
        a.greet();
    }
}
