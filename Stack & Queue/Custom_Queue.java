public class Custom_Queue{
    private int[] data;
    private static final int DEFAULT_SIZE = 10;
    
    int end = 0;

    public Custom_Queue() {
        this(DEFAULT_SIZE);
    }

    public Custom_Queue(int size) {
        this.data = new int[size];
    }

    public boolean isFull(){
        return end == data.length; // end is at last index
    }

    public boolean isEmpty(){
        return end == 0;
    }

    public boolean insert(int item){
        if(isFull()){
            System.out.println("Queue is full");
            return false;
        }
        data[end++] = item;
        return true;
    }
    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Cannot remove from an empty queue!");
        }
        int removed = data[0];
        for(int i = 0; i < end - 1; i++){
            data[i] = data[i + 1];
        }
        end--;
        return removed;
    } 
    public int front() throws Exception{
        if(isEmpty()){
            throw new Exception("Cannot peek from an empty queue!");
        }
        return data[0];
    }
    public void display(){
        for(int i = 0; i < end; i++){
            System.out.print(data[i] + " <- ");
        }
        System.out.println("END");
    }
    public static void main(String[] args) throws Exception {
        Custom_Queue queue = new Custom_Queue(5);
        queue.insert(34);
        queue.insert(45);
        queue.insert(2);
        queue.insert(9);
        queue.insert(18);
        queue.insert(23);
        queue.display();
        System.out.println(queue.remove());
        queue.display();
    }
}