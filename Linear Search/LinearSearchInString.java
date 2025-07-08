import java.util.Scanner;
public class LinearSearchInString{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String target = sc.nextLine();
        boolean ans = linearSearch(name, target.charAt(0));
        System.out.println(ans);
    }
    static boolean linearSearch(String name, char target){
        for(int i=0;i<name.length();i++){
            if(name.charAt(i) == target){
                return true;
            }
        }
        return false;
    }
}