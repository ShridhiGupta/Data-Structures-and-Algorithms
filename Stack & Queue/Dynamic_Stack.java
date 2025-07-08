public class Dynamic_Stack extends Custom_Stack {
    public Dynamic_Stack(){
        super(); // it will call Custom_Stack()
    }
    public Dynamic_Stack(int size){
        super(size); // it will call Custom_Stack(int size)
    }

    @Override
    public boolean push(int item){
        // this take care of it being full
        if(this.isFull()){
            // double the array size
            int[] temp = new int[2 * data.length];

            // copy all previous item in new data
            for(int i = 0; i < data.length; i++){
                temp[i] = data[i];
            }
            data = temp;
            // or we can use System.arraycopy(data, 0, temp, 0, data.length);
        }
        // at this point we know that array is not full
        // so we can push the item
        return super.push(item);
    }
}