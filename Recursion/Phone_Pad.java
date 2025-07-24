import java.util.ArrayList;

public class Phone_Pad {
    static final String[] KEYPAD = {
        "",     // 0
        "",     // 1
        "abc",  // 2
        "def",  // 3
        "ghi",  // 4
        "jkl",  // 5
        "mno",  // 6
        "pqrs", // 7
        "tuv",  // 8
        "wxyz"  // 9
    };

    public static void main(String[] args) {
        System.out.println(keyPadList("", "23"));
        System.out.println("Total combinations: " + keyPadCount("", "23"));
    }

    static void keyPad(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        int digit = up.charAt(0) - '0';
        String letters = KEYPAD[digit];
        for (char ch : letters.toCharArray()) {
            keyPad(p + ch, up.substring(1));
        }
    }

    static ArrayList<String> keyPadList(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        int digit = up.charAt(0) - '0';
        String letters = KEYPAD[digit];
        for (char ch : letters.toCharArray()) {
            ans.addAll(keyPadList(p + ch, up.substring(1)));
        }
        return ans;
    }
    static int keyPadCount(String p, String up) {
        if (up.isEmpty()) {
            return 1;
        }
        int count = 0;
        int digit = up.charAt(0) - '0';
        String letters = KEYPAD[digit];
        for (char ch : letters.toCharArray()) {
            count +=keyPadCount(p + ch, up.substring(1));
        }
        return count;
    }
}
