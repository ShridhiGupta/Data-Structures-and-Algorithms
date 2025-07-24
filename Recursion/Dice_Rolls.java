import java.util.ArrayList;

public class Dice_Rolls {
    public static void main(String[] args) {
        dice ("", 4);
        System.out.println(diceList("", 4));
        System.out.println("Total combinations: " + diceCount("", 4));
        diceFace("", 8, 8);
        System.out.println(diceFaceList("", 8, 8));
        System.out.println("Total combinations with face 8: " + diceFaceCount("", 8, 8));
    }
    static void dice(String p, int target) {
        if (target == 0) {
            System.out.println(p);
            return;
        }
        for (int i = 1; i <= 6 && i <= target; i++) {
            dice(p + i, target - i);
        }
    }
    static ArrayList<String> diceList(String p, int target) {
        if (target == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 1; i <= 6 && i <= target; i++) {
            ans.addAll(diceList(p + i, target - i));
        }
        return ans;
    }
    static int diceCount(String p, int target) {
        if (target == 0) {
            return 1;
        }
        int count = 0;
        for (int i = 1; i <= 6 && i <= target; i++) {
            count += diceCount(p + i, target - i);
        }
        return count;
    }
    static void diceFace(String p, int target, int face) {
        if (target == 0) {
            System.out.println(p);
            return;
        }
        for (int i = 1; i <= face && i <= target; i++) {
            diceFace(p + i, target - i, face);
        }
    }
    static ArrayList<String> diceFaceList(String p, int target, int face) {
        if (target == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 1; i <= face && i <= target; i++) {
            ans.addAll(diceFaceList(p + i, target - i, face));
        }
        return ans;
    }
    static int diceFaceCount(String p, int target, int face) {
        if (target == 0) {
            return 1;
        }
        int count = 0;
        for (int i = 1; i <= face && i <= target; i++) {
            count += diceFaceCount(p + i, target - i, face);
        }
        return count;
    }
}
