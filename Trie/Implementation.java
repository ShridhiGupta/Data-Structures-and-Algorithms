public class Implementation {

    static class Node{
        Node[] children;
        boolean endOfWord;

        Node(){
            children = new Node[26];
            for(int i=0;i<26;i++){
                children[i] = null;
            }
            endOfWord = false;
        }
    }

    static Node root = new Node();

    static void insert(String word){
        Node curr = root;
        for(int i=0; i<word.length(); i++){ // O(L), L = length of word
            int index = word.charAt(i) - 'a';
            if(curr.children[index] == null){
                curr.children[index] = new Node();
            }
            curr = curr.children[index];
        }
        curr.endOfWord = true;
    }

    static boolean search(String word){
        Node curr = root;
        for(int i=0; i<word.length(); i++){ // O(L), L = length of word
            int index = word.charAt(i) - 'a';
            if(curr.children[index] == null){
                return false;
            }
            curr = curr.children[index];
        }
        return curr.endOfWord;
    }
    public static void main(String[] args) {
        String words[] = {"the", "a", "there", "their", "any"};
        for(String word: words){
            insert(word);
        }
        System.out.println(search("their"));   // true
        System.out.println(search("thor")); // false
        System.out.println(search("an")); // false
    }
}