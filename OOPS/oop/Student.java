public class Student {
    private int rollNo;
    private String name;
    private float marks;
    Student(int rollNo, String name, float marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }
    public static void main(String[] args) {
        Student s1 = new Student(1, "Alice", 85.5f);
        Student s2 = new Student(2, "Bob", 90.0f);
        Student s3 = new Student(3, "Charlie", 78.0f);
        System.out.println("Student 1: " + s1.name + ", Roll No: " + s1.rollNo + ", Marks: " + s1.marks);
        System.out.println("Student 2: " + s2.name + ", Roll No: " + s2.rollNo + ", Marks: " + s2.marks);
        System.out.println("Student 3: " + s3.name + ", Roll No: " + s3.rollNo + ", Marks: " + s3.marks);
    }
}
