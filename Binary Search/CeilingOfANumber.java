import java.util.Scanner;
public class CeilingOfANumber{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {2,3,5,9,14,16,18};
        int target = in.nextInt();
        int ans = binarySearch(arr, target);
        System.out.println(ans);
        in.close();
    }
    static int binarySearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        int s = 0;
        int e = arr.length-1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(arr[mid] < target) s = mid+1;
            else if(arr[mid] > target) e = mid-1;
            else return mid;
        }
        return s;
    }
}