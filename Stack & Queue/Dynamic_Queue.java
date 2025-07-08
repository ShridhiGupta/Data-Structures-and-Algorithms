public class Dynamic_Queue extends Circular_Queue {
    public Dynamic_Queue(){
        super(); // it will call Circular_Queue()
    }
    public Dynamic_Queue(int size){
        super(size); // it will call Circular_Queue(int size)
    }

    @Override
    public boolean insert(int item){
        // this take care of it being full
        if(this.isFull()){
            // double the array size
            int[] temp = new int[2 * data.length];

            // copy all previous items in new data
            if (front <= end) {
                System.arraycopy(data, front, temp, 0, size);
            } else {
                System.arraycopy(data, front, temp, 0, data.length - front);
                System.arraycopy(data, 0, temp, data.length - front, end);
            }

            front = 0;
            end = size;
            data = temp;
        }
        // at this point we know that array is not full
        // so we can push the item
        return super.insert(item);
    }
}
