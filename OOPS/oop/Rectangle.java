public class Rectangle {
    private int length;
    private int breadth;
    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    private int area() {
        return length * breadth;
    }
    private int perimeter() {
        return 2 * (length + breadth);
    }
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5, 10);
        System.out.println("Area: " + rect.area());
        System.out.println("Perimeter: " + rect.perimeter());
    }
}
