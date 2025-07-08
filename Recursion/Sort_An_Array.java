import java.util.ArrayList;

public class Sort_An_Array {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6};
        ArrayList<Integer> list = new ArrayList<>();
        for (int num : arr) {
            list.add(num);
        }
        sort(list);
        for (int num : list) {
            System.out.print(num + " ");
        }
    }

    static void sort(ArrayList<Integer> list) {
        if (list.size() == 0) return;
        int temp = list.remove(list.size() - 1);
        sort(list);
        insert(list, temp);
    }

    static void insert(ArrayList<Integer> list, int temp) {
        if (list.size() == 0 || list.get(list.size() - 1) <= temp) {
            list.add(temp);
            return;
        }
        int val = list.remove(list.size() - 1);
        insert(list, temp);
        list.add(val);
    }
}
