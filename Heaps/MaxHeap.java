import java.util.*;

public class MaxHeap {
    List<Integer> heap;
    public MaxHeap(){
        heap = new ArrayList<Integer>();
    }
    public MaxHeap()(int[] nums){
        // build max heap using nums
    }

    public int peek(){
        if(heap.size() == 0){
            return Integer.MAX_VALUE;
        }
        return heap.get(0);
    }

    public void heapify(int index){
        int size = heap.size();
        int largest = index;
        while (index < size) {
            int left = 2*index + 1;
            int right = 2*index + 2;
            if(left < size && heap.get(left) > heap.get(largest)){
                largest = left;
            }
            if (right < size && heap.get(right) > heap.get(largest)) {
                largest = right;
            }
            if(largest != index){
                Collections.swap(heap, largest, index);
                index = largest;
            }
            else{
                break;
            }
        }
    }

    public void insert(int value){
        heap.add(value);
        int index = heap.size() - 1;
        while (index > 0) {
            int parent = (index - 1) / 2;
            if (heap.get(index) > heap.get(parent)) {
                Collections.swap(heap, index, parent);
                index = parent;
            }
            else {
                break;
            }
        }
    }

    public int remove(){
        if(heap.size() == 0){
            return Integer.MAX_VALUE;
        }
        int parent = heap.get(0);
        int last = heap.remove(heap.size() - 1);
        if(heap.size() > 0){
            heap.set(0, last);
            heapify(0);
        }
        return parent;
    }
}

