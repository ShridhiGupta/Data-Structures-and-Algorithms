public class Main{
    public static void main(String[] args) {
        Student student1 = new Student(13, "Shree", 85 );
        // student1.rno = 13;
        // student1.name = "Shridhi Gupta";
        // student1.marks = 90;
        student1.greeting();
        System.out.println(student1.rno);
        System.out.println(student1.name);
        System.out.println(student1.marks);
        Student random = new Student(student1);
        System.out.println(random.name);
        Student random2 = new Student();
        System.out.println(random2.name);
    }
}
class Student{
    int rno;
    String name;
    float marks = 88;
    // we need a way to add the values of the above properties object by object
    // we need one word to access every object
    void greeting(){
        System.out.println("Hello, I am a student");
    }
    void changeName(String name){
        this.name = name;
    }
    Student(Student other){
        this.rno = other.rno;
        this.name = other.name;
        this.marks = other.marks;
    }
    Student(){
        // this is how you call a constructor from another constructor
        // internally : new Student (13, "default", 100.0f);
        this(13, "default", 100.0f);
    }
    // Student arpit = new Student(17, "Arpit", 89.7f);
    // here, this will be replaced by arpit
    Student(int rno, String name, float marks){
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }
}