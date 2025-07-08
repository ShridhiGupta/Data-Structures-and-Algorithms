public class Circular_Linked_List {
    private class Node{
        int val;
        Node next;
        public Node(int val){
            this.val = val;
        }   
    }

    private Node head;
    private Node tail;

    public Circular_Linked_List(){
        this.head = null;
        this.tail = null;
    }
    public void insert(int val){
        Node node = new Node(val);
        if(head == null){
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }
    public void display(){
        Node node = head;
        if(head != null){
            do{
                System.out.print(node.val + " -> ");
                node = node.next;
            }while(node != head);
            System.out.println("HEAD");
        }
    }
    public void delete(int val){
        Node node = head;
        if(head == null){
            return;
        }
        if(head.val == val){
            head = head.next;
            tail.next = head;
            return;
        }
        while(node.next != head){
            if(node.next.val == val){
                node.next = node.next.next;
                return;
            }
            node = node.next;
        }
        // do{
        //     Node n = node.next;
        //     if(n.val == val){
        //         node.next = n.next;
        //         break;
        //     }
        //     node = node.next;
        // }while(node != head);
    }
    public static void main(String[] args) {
        Circular_Linked_List list = new Circular_Linked_List();
        list.insert(23);
        list.insert(3);
        list.insert(19);
        list.insert(75);
        list.display();
        list.delete(19);
        list.display();
    }
}
