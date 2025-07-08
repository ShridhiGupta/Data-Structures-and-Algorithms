import java.util.Scanner;
public class SearchInRange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] arr = {18,15,-7,3,14,28};
        System.out.print("Enter the starting index:");
        int s = in.nextInt();
        System.out.print("Enter the ending index:");
        int e = in.nextInt();
        System.out.print("Enter the number to search:");
        int target = in.nextInt();
        int ans = searchInrange(arr, s, e, target);
        System.out.println(ans);
    }
    static int searchInrange(int[] arr, int s, int e, int target){
        for(int i=s;i<=e;i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}