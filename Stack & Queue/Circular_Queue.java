public class Circular_Queue {
    private int[] data;
    private static final int DEFAULT_SIZE = 10;
    
    private int end = 0;
    private int front = 0;
    private int size = 0;

    public Circular_Queue() {
        this(DEFAULT_SIZE);
    }

    public Circular_Queue(int size) {
        this.data = new int[size];
    }

    public boolean isFull(){
        return size == data.length; // end is at last index
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public boolean insert(int item){
        if(isFull()){
            System.out.println("Queue is full");
            return false;
        }
        data[end++] = item;
        end = end % data.length;
        size++;
        return true;
    }

    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Cannot remove from an empty queue!");
        }
        int removed = data[front++];
        front = front % data.length;
        size--;
        return removed;
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Queue is empty!");
            return;
        }
        int i = front;
        do{
            System.out.print(data[i] + " -> ");
            i = (i + 1) % data.length;
        }while(i != end);
        System.out.println("END");
    }

    public static void main(String[] args) throws Exception {
        Circular_Queue queue = new Circular_Queue(5);
        queue.insert(34);
        queue.insert(45);
        queue.insert(2);
        queue.insert(9);
        queue.insert(18);
        queue.insert(23);
        queue.display();
        System.out.println(queue.remove());
        queue.insert(133);
        queue.display();
    }
}
