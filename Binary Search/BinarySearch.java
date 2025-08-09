import java.util.Scanner;
public class BinarySearch{
    private static int binarySearch(int[] nums, int s, int e){
        while(s<e){
            int mid = s+(e-s)/2;
            if(nums[mid] < target) s++;
            else if(nums[mid] > target) e--;
            else return mid;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int target = 5;
        int s = 0;
        int e = arr.length-1;
        int ans = binarySearch(arr, s, e);
        System.out.println("Element found at: ", ans);
    }
}
