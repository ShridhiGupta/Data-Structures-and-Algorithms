import java.util.Scanner;
public class MinimumNumber{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] arr = {18,15,-7,3,14,28};
        int ans = minimum(arr);
        System.out.println("Minimum:"+ans);
    }
    static int minimum(int[] arr){
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(min>arr[i]){
                min = arr[i];
            }
        }
        return min;
    }
}