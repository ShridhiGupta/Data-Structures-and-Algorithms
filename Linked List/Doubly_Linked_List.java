public class Doubly_Linked_List {
    private Node head;
    private Node tail;
    private int size;
    private Doubly_Linked_List(){
        this.size = 0;
    }
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head != null){
            head.prev = node;
        }
        head = node;
    }
    public void display(){
        Node node = head;
        Node last = null;
        while(node != null){
            System.out.print(node.value + " -> ");
            last = node;
            node = node.next;
        }
        System.out.println("NULL");
        System.out.println("Print in reverse");
        while(last != null){
            System.out.print(last.value + " -> ");
            last = last.prev;
        }
        System.out.println("NULL");
    }
    public void insertLast(int val){
        Node node = new Node(val);
        Node curr = head;
        node.next = null;
        if(head == null){
            node.prev = null;
            head = node;
            return;
        }
        while(curr.next != null){
            curr = curr.next;
        }
        curr.next = node;
        node.prev = curr;
    }
    public Node find(int val){
        Node node = head;
        while(node != null){
            if(node.value == val){
                return node;
            }
            node = node.next;
        }
        return node;
    }
    public void insert(int after, int val){
        Node p = find(after);
        if(p == null){
            System.out.println("Element not found");
            return;
        }
        Node node = new Node(val);
        node.next = p.next;
        p.next = node;
        node.prev = p;
        if (node.next != null) {
            node.next.prev = node;
            
        }
    }
    private class Node{
        private int value;
        private Node next;
        private Node prev;
        public Node(int value){
            this.value = value;
        }
        public Node(int value, Node next, Node prev){
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
    public static void main(String[] args) {
        Doubly_Linked_List list = new Doubly_Linked_List();
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(8);
        list.insertFirst(17);
        list.insertLast(99);
        list.display();
        list.insert(8, 65);
        // System.out.println(list.deleteFirst());
        // list.display();
        // System.out.println(list.deleteLast());
        list.display();
    }
}
