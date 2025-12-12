import java.util.Scanner;

class BinaryTree {
    private static class Node {
        int value;
        Node left, right;
        public Node(int value) {
            this.value = value;
        }
    }

    private Node root;
    public void populate(Scanner scanner) {
        System.out.println("Enter values to insert at root node:");
        int value = scanner.nextInt();
        root = new Node(value);
        populate (scanner, root);
    }
    private void populate(Scanner scanner, Node node) {
        System.out.println("Do you want to enter left child of " + node.value);
        boolean left = scanner.nextBoolean();
        if (left) {
            System.out.println("Enter value for left child of " + node.value + ":");
            int value = scanner.nextInt();
            node.left = new Node(value);
            populate(scanner, node.left);
        }
        System.out.println("Do you want to enter right child of " + node.value);
        boolean right = scanner.nextBoolean();
        if (right) {
            System.out.println("Enter value for right child of " + node.value + ":");
            int value = scanner.nextInt();
            node.right = new Node(value);
            populate(scanner, node.right);
        }
    } 
    public void display() { 
        display(root, "");
    }
    private void display(Node node, String indent) {
        if( node == null) {
            return;
        }
        System.out.println(indent + node.value);
        display(node.left, indent + "\t");
        display(node.right, indent + "\t");
    }
    public void prettyDiplay(){
        prettyDisplay(root, 0);
    }
    private void prettyDisplay(Node node, int level) {
        if (node == null) {
            return;
        }
        prettyDisplay(node.right, level + 1);
        if(level != 0){
            for(int i = 0; i < level - 1; i++) {
                
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();
        tree.populate(sc);
        System.out.println("Binary Tree Structure:");
        tree.display();
    }
        
}