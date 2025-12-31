import java.util.*;
import java.lang.*;
import java.io.*;

public class Reversed_Word_in_a_String{
    public static void main(String[] args) {
        String shree = "the sky is blue";
        System.out.println(answer(shree));
    }
    private static String answer (String shree){
        String ans = "";
        reverse(shree.begin(), shree.end());
        for(int i=0;i<shree.length();i++){
            String word = "";
            while(i<shree.length() && shree[i] != ' '){
                word += shree[i];
                i++;
            }
            reverse(word.begin(), word.end());
            if(word.length() > 0){
                ans += " " + word;
            }
        }
        return ans.substring(1);
    }
}