public class Appearing_Once {
    public static void main(String[] args) {
        int[] arr = {2,3,3,4,2,4,6};
        System.out.println(appearingOnce(arr));
    }
    private static int appearingOnce(int[] arr){
        int unique = 0;
        for(int n : arr){
            unique ^= n;
        }
        return unique;
    }
}
