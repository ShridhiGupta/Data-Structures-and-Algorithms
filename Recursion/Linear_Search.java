import java.util.ArrayList;

public class Linear_Search {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 4, 4, 5};
        int target = 4;
        System.out.println(search(arr, target, 0));
        System.out.println(searchIndexFirst(arr, target, 0));
        System.out.println(searchIndexLast(arr, target, arr.length-1));
        findAllIndex(arr, target, 0);
        System.out.println(list);
        ArrayList <Integer> list = new ArrayList<>();
        ArrayList <Integer> ans = findAllIndex1(arr, target, 0, list);
        System.out.println(ans);
        System.out.println(findAllIndex2(arr, target, 0));
        
    }
    static boolean search(int[] arr, int target, int i){
        if(arr.length == i) return false;
        return arr[i] == target || search(arr, target, i+1);
    }
    static int searchIndexFirst(int[] arr, int target, int i){
        if(arr.length == i) return -1;
        return arr[i] == target ? i : searchIndexFirst(arr, target, i+1);
    }
    static int searchIndexLast(int[] arr, int target, int i){
        if(i == -1) return -1;
        return arr[i] == target ? i : searchIndexLast(arr, target, i-1);
    }
    static ArrayList <Integer> list = new ArrayList<>();
    static void findAllIndex(int[] arr, int target, int i){
        if(arr.length == i) return;
        if(arr[i] == target) list.add(i);
        findAllIndex(arr, target, i+1);
    }
    static ArrayList findAllIndex1(int[] arr, int target, int i, ArrayList <Integer> list){
        if(arr.length == i) return list;
        if(arr[i] == target) list.add(i);
        return findAllIndex1(arr, target, i+1, list);
    }
    static ArrayList findAllIndex2(int[] arr, int target, int i){
        ArrayList <Integer> list = new ArrayList<>();
        if(arr.length == i) return list;
        // this will contain answer for that function call only
        if(arr[i] == target) list.add(i);
        ArrayList<Integer> amsFromBelowCalls = findAllIndex2(arr, target, i+1);
        list.addAll(amsFromBelowCalls);
        return list;
    }
}   
