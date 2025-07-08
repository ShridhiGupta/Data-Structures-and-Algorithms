import java.util.Scanner;

public class Binary_Tree{
    private class Node{
        int data;
        Node left;
        Node right;
        Node(int data, Node left, Node right){
            this.data = data;
            this.left = left;
            this.right = right;
        } 
    }
    Node root = null;
    int size = 0;
    Binary_Tree(){
        Scanner sc = new Scanner(System.in);
        this.root = createBinaryTree(sc, null, false);
    }
    private Node createBinaryTree(Scanner sc, Node parent, boolean leftOrRight){
        if(parent == null){
            System.out.println("Enter the data for root node:");
        }
        else{
            if(leftOrRight){
                System.out.println("Enter the data for left child of " + parent.data);
            }
            else{
                System.out.println("Enter the data for right child of " + parent.data);
            }
        }
    }
    int data = sc.nextInt();
    Node node = new Node(data, null, null);
} 