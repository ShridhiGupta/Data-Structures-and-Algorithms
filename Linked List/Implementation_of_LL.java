public class Implementation_of_LL{
    public static class LinkedList {
        private Node head;
        private Node tail;
        private int length;

        class Node {
            int value;
            Node next;

            Node(int value) {
                this.value = value;
            }
        }

        public LinkedList(int value) {
            Node newNode = new Node(value);
            head = newNode;
            tail = newNode;
            length = 1;
        }
        public void printValue(int value){
            Node temp = head;
            while (temp != null) {
                System.out.println(temp.value);
                temp = temp.next;
            }
        }
        public void getHead(){
            System.out.println(head.value);
        }
        public void getTail(){
            System.out.println(tail.value);
        }
        public void getLength(){
            System.out.println(length);
        }
        public void append(int value){
            Node newNode = new Node(value);
            if(length == 0){
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
            length++;
        }
    }

    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(4);
        System.out.println("LinkedList created with head value: " + myLinkedList.head.value);
        myLinkedList.append(5);
        myLinkedList.append(6);
        myLinkedList.append(7);
        myLinkedList.printValue(5);
        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();
    }
}
