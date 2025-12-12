import java.lang.reflect.Array;
import java.util.*;

public class Permutations {
    public static void main(String[] args) {
        // permutaions("", "abc");
        ArrayList<String> result = permutaionsList("", "abc");
        System.out.println(result);
        int count = countPermutations("", "abc");
        System.out.println("Total permutations: " + count);
    }
    static void permutaions(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for(int i = 0; i <= p.length(); i++){
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            permutaions(f + ch + s, up.substring(1));
        }
    }
    static ArrayList<String> permutaionsList(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> ans = new ArrayList<>();
        for(int i = 0; i <= p.length(); i++){
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            ans.addAll(permutaionsList(f + ch + s, up.substring(1)));
        }
        return ans;
    }
    static int countPermutations(String p, String up) {
        if (up.isEmpty()) {
            return 1;
        }
        char ch = up.charAt(0);
        int count = 0;
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            count += countPermutations(f + ch + s, up.substring(1));
        }
        return count;
    }
}
