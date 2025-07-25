import java.util.ArrayList;

public class Maze{
    public static void main(String[] args) {
        System.out.println(count(3, 3));
        path("", 3, 3);
        System.out.println(pathList("", 3, 3));
        System.out.println(pathListDiagonal("", 3, 3)); 
    }
    static int count(int r, int c){
        if(r == 1 || c == 1) {
            return 1;
        }
        int left =  count(r - 1, c);
        int right = count(r, c - 1);
        return left + right;
    }
    static void path(String p, int r, int c) {
        if (r == 1 && c == 1) {
            System.out.println(p);
            return;
        }
        if(r > 1) {
            path(p + "D", r - 1, c);
        }   
        if(c > 1) {
            path(p + "R", r, c - 1);
        }
    }
    static ArrayList<String> pathList(String p, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);    
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        if(r > 1) {
            ans.addAll(pathList(p + "D", r - 1, c));
        }   
        if(c > 1) {
            ans.addAll(pathList(p + "R", r, c - 1));
        }
        return ans;
    }
    static ArrayList<String> pathListDiagonal(String p, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);    
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        if(r > 1) {
            ans.addAll(pathListDiagonal(p + "V", r - 1, c));
        }   
        if(c > 1) {
            ans.addAll(pathListDiagonal(p + "H", r, c - 1));
        }
        if(r > 1 && c > 1) {
            ans.addAll(pathListDiagonal(p + "D", r - 1, c - 1));
        }
        return ans;
    }
}
