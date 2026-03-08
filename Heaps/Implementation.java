import java.util.*;

public class Implementation{
    public static void main(String[] args) {
        PriorityQueue<Integer> min_heap = new PriorityQueue<>();
        PriorityQueue<Integer> max_heap = new PriorityQueue<>(Collections.reverseOrder());

        min_heap.add(9);
        min_heap.add(-2);
        min_heap.add(48);
        min_heap.add(265);

        max_heap.add(68);
        max_heap.add(-87);
        max_heap.add(75);
        max_heap.add(98);

        System.out.println("Min Heap :- ");
        while(!min_heap.isEmpty()){
            System.out.print(min_heap.poll() + " ");
        }
        System.out.println();

        System.out.println("Max Heap :- ");
        while(!max_heap.isEmpty()){
            System.out.print(max_heap.poll() + " ");
        }

    }
}