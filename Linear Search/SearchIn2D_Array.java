import java.util.Scanner;
public class SearchIn2D_Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = {
            {23,4,1},
            {18,12,3,9},
            {78,99,34,56},
            {18,12}
        };
        System.out.print("Enter the element to search:");
        int target = in.nextInt();
        int[] ans = search(arr, target);
        System.out.println("Index:-\n"+ans[0]+"\n"+ans[1]);
    }
    static int[] search(int[][] arr, int target){
        int[] ans;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;i++){
                if(arr[i][j] == target){
                    return new int[] {i,j};
                }
            }
        }
        return null;
    }
}
