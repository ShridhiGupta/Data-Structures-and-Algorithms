public class PrettyPrinting {
    public static void main(String[] args) {
        float a = 453.1274f;
        System.out.printf("%.2f", a);
        System.out.printf("%.3f", Math.PI);
        System.out.printf("Hello my name is %s and I am %d years old", "Shridhi", 21);
    }
}
// %c - Character
// %d - Decimal Number (base 10)
// %e - Exponential Floating Point
// %f - Floating Point
// %i - Integer (base 10)
// %o - Octal Number (base 8)
// %s - String
// %u - Unsigned Decimal (positive integer)
// %x - Hexadecimal Number (base 16)
// %t - Date/Time
// %n - New Line