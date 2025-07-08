public class Human_Class {
    public static void main(String[] args) {
        Human kunal = new Human(22, "Kunal", 10000, false);
        Human rahul = new Human(34, "Rahul", 15000, true);
        Human shree = new Human(18, "Shridhi", 50000, false);
        
        System.out.println(Human.population);
        System.out.println(Human.population);
        System.out.println(Human.population);
        // Main funn = new Main();
        // funn.fun2();
    }
    // this is not dependent on objects
    static void fun(){
        // greeting(); // you can not use this because it requires an instance
        // but the function you are using it in does not depend on instances
        
        // you can not access non static stuff without referencing their instances in a static context
        
        // hence, here I am refering it

        // Main obj = new Main();
        // obj.greeting();

        Human_Class obj = new Human_Class();
        obj.greeting();
    }
    void fun2(){
        greeting();
    }
    // we know that something which is not static, belongs to an object
    void greeting(){
        System.out.println("Hello World");
    }
}
 